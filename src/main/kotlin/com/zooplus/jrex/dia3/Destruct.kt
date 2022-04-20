package com.zooplus.jrex.dia3

data class Example1(val name: String, val legs: Byte)

fun main() {
    val e = Example1("Jack", 1)
    val (n, l) = e

    println("Name=> $n, legs =>$l")

    val m = mapOf("a" to 2, "b" to 1)

    for((key, value) in m) {
        println("k:$key - v:$value")
    }
}
