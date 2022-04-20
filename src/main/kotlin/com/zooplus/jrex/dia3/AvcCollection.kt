package com.zooplus.jrex.dia3

fun main() {

    val l = listOf<String>("Guau", "Miau", "Yes", "E") //ArrayList
    setOf<Int>(1,2,3,5,3).forEach { println(it) } //Set
    mapOf<Int, String>(1 to "Tai", 2 to "Sora", 3 to "Izzy").forEach { println("${it.key}: ${it.value}") }
    arrayListOf<Int>(1, 2)
    linkedSetOf<Int>(1, 2, 3, 4, 5, 2)

    l.map { it.length }.forEach(::println)
}
