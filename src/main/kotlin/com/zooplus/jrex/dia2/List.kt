package com.zooplus.jrex.dia2

fun main() {
    val lint = listOf(1,2,3,4,5) //Implicit
    val lint2 = listOf<Int>(1,2,3,4,5,5,4,3,2,1) //Explicit
    val lint3: List<Int> = listOf() //Also Explicit

    println("First element: ${lint[0]}")
    println("Using get: ${lint.get(0)}")
    println("Using element at: ${lint2.elementAtOrElse(25) { -1 }}")
    println("Using sum: ${lint.sum()}")
    println("Using lastIndex: ${lint2.lastIndexOf(3)}")

    val immutable = listOf(1,2,3,4) //Inmutable
    val mutable = mutableListOf(1,2) //Mutable

    mutable.add(4)
    println("Mutable: $mutable")
    mutable.add(2, 3)
    println("Mutable: $mutable")

    //inmutable.add(3) => Error
    mutable.addAll(immutable)
    println("Mutable: $mutable")

    println("Mutable: ${mutable.plus(7)}") //Only adds it in this line
    println("Immutable: ${immutable.plus(5)}") //Only adds it in this line
    mutable.plusAssign(8)
    println("Mutable: $mutable")
    mutable += 9 //Same as plusAssign
    //immutable += 5 => Error
    println("Mutable: $mutable")
    mutable.remove(8)
    println("Mutable: $mutable")
    mutable.removeAll(listOf(4)) //removes all the 4s
    println("Mutable: $mutable")
    mutable.removeAll(listOf(9))
    println("Mutable: $mutable")

    immutable.forEach{x -> println("Value: $x")}
    mutable.forEach {println("Value: $it")} //Same as line before

}
