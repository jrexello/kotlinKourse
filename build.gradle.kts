import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20"
    application //Generates binaries
    jacoco //Generates coverage reports
}

group = "com.zooplus.jrex"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //Testing
    testImplementation(kotlin("test"))
    //Explicit set JUnit 5
    testImplementation(platform("org.junit:junit-bom:5.8.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    //Test Suites
    testImplementation("org.junit.platform:junit-platform-suite-api:1.8.2")
    testRuntimeOnly("org.junit.platform:junit-platform-suite-engine:1.8.2")
    // For mocks
    testImplementation("org.mockito.kotlin:mockito-kotlin:4.0.0")

    //For reflection usage
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.6.20")
    //Arrow Core
    implementation("io.arrow-kt:arrow-core:1.0.1")
    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(false)
        csv.required.set(false)
        html.outputLocation.set(layout.buildDirectory.dir("jacocoHtml"))
    }
}
