package com.zooplus.jrex.dia1

fun main() {
    val name = "Donald"
    val name2 = "   Donald     "

    println("Length: " + name.length)
    println("Reversed: " + name.reversed())
    println("Concat: " + name + name)

    println(name.padEnd(10, '*'))
    println(name.padStart(10, '*'))
}
