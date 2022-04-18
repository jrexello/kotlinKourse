package com.zooplus.jrex.dia1

fun main() {

    val a = 11111111111111111
    val b = 12.43333333333333

    println(a)
    println(b)

    val c = 0x15af
    println(c)
    val d = 0b0111
    println(d)
    //Not octal

    val e = 1_000_000
    val e1 = 1000000
    val e2 = 10000_00

    println(e == e1)
    println(e1 == e2)

}
