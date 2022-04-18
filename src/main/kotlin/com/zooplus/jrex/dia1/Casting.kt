package com.zooplus.jrex.dia1

fun main() {
    println(isString("Duck"))
    println(isString(2))
}

fun isString(x: Any): Boolean {
    return x is String
}
