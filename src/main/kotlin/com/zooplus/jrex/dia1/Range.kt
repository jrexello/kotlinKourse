package com.zooplus.jrex.dia1

fun main() {
    val x = 1..5
    val y = 2

    x.forEach{println(it)}
    if (y in x) {
        println("Found")
    }
}
