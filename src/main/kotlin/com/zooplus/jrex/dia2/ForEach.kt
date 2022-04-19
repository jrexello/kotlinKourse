package com.zooplus.jrex.dia2

fun main() {
    val forest = listOf("Bird", "Fox", "Squirrel")

    println("Inline:")
    for (animal in forest) println(animal)

    println("Normal:")
    for (animal in forest) {
        println(animal)
    }

    println("Range:")
    for (i in 1..10) {
        println(i)
    }

    println("Exclusive range")
    for (i in 1 until 10) {
        println(i)
    }

    println("Range steps")
    for (i in 1 .. 10 step 2) {
        println(i)
    }

    println("Range down")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}
