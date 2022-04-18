package com.zooplus.jrex.dia1

fun main() {
    val a = true
    val b = !a

    println("a=$a, b=$b")
    println()
    println("a && b => ${logger(a) && logger(b)}")
    println()
    println("a || b => ${logger(a) || logger(b)}")
    println()
    println("b && b => ${logger(b) && logger(a)}")
}

fun logger(x: Boolean): Boolean {
    println("logger $x")
    return x
}
