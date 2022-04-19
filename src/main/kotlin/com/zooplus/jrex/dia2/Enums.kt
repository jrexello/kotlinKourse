package com.zooplus.jrex.dia2

enum class CardinalPoints {
    North, South, East, West
}

enum class Address(val street: String) {
    Ad1("Fish Street"),
    Ad2("Fox Street")
}

fun main() {
    println(CardinalPoints.North)
    println(CardinalPoints.East)
    println(CardinalPoints.South)
    println(CardinalPoints.West)

    val a: CardinalPoints = CardinalPoints.North
    if(CardinalPoints.North == a) {
        println("Name: ${CardinalPoints.North.name}.")
        println("Ordinal: ${CardinalPoints.North.ordinal}.")
    }

    println("Raw Address: ${Address.Ad1}")
    println("Street Address: ${Address.Ad1.street}")
    println("Name Address: ${Address.Ad1.name}")

    println("Value of North: ${CardinalPoints.valueOf("North")}")
    println("Ordinal of North: ${CardinalPoints.valueOf("North").ordinal}")
    println("Value of Duck: ${CardinalPoints.valueOf("Duck")}")
}
