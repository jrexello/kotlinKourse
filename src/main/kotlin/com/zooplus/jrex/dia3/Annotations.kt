package com.zooplus.jrex.dia3

annotation class MyCustomApp

@Target(AnnotationTarget.CLASS)
//@Retention()
@Repeatable
@MustBeDocumented
annotation class Special(val reason: String)

@MyCustomApp
@Special("Duck")
@Special("Because yes")
class Dog

fun main() {

    val d = Dog()

}
