package com.zooplus.jrex.dia1

fun main() {
    val a: Any = "Duck"
    val b: Any = 13

    checkString(a)
    checkString(b)
    complexCheck(a)
    complexCheck(b)
    complexCheck("")
}

fun checkString(x: Any) {
    if (x is String) {
        //Do something
        //Now Kotlin knows is a String (Inside the block)
        println(x.uppercase())
    } else {
        println("Not a String")
    }
}

fun complexCheck(x: Any) {
    if (x !is String || x.length == 0) {
        println("???")
    } else {
        println(x.lowercase())
    }
}

