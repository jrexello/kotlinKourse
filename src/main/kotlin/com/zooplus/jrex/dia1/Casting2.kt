package com.zooplus.jrex.dia1

fun main() {
    val a: Any = "Duck"
    val b: Any = 12

    println(a.toString())
    println(b.toString())

    val c: String = a as String //Java = (String) a
    // val d: String = b as String //Would fail
    println(12.toDouble())
    println(1.7.toInt()) //Will lose precision

}

