package com.zooplus.jrex.dia3

fun main() {
    val a = { x: Int -> x.toString() }
    //Type: (Int) -> String
    val b = fun(s: String): Int { return s.length }
    //Same, but more verbose
    //Type: (String) -> Int

    val l = listOf(1,20,300,4000)

    val rs = l.map { x -> x * 10}.map(a).map(b).filter { it > 3 }

    println(rs)
}
