package com.zooplus.jrex.dia2

fun main() {

    abstract class Animal {

        abstract val name: String

        fun salute() = println("My name is $name")

        abstract fun describe(): String

    }

    class Dog(override val name: String): Animal() {

        override fun describe(): String {
            return "Guau. My name is $name"
        }

        fun bark() = println("Guau, guau")

    }

    val d = Dog("Rex")
    d.bark()
    d.salute()
    println(d.describe())

}
