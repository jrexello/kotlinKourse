package com.zooplus.jrex.dia3
import com.zooplus.jrex.dia3.Bit.*
//Use it when you have nested ifs or huge switches, etc

enum class Bit {
    Active, Disable, Init
}
fun main() {

    //When
    val b: Bit = Bit.Disable
    when(b) {
        Active -> println("Is Active")
        Disable -> println("Is Disable")
        Init -> println("Is Init")
    }

    //If
    val x = 13

    when(x) {
        1 -> println("Is 1")
        2 -> println("Is 2")
        else -> println("Huge number")
    }

    //Range
    val y = listOf(11, 13)
    when(x) {
        in 1 .. 10 -> println("Small number")
        in y -> println("Is 11 or 13")
        !in 20 .. 30 -> println("Not in the twenties")
        5 -> println("Is five")
    }

    val xx = 12
    val yy = 13
    when {
        xx == 17 -> println("xx is 17")
        yy < 13 -> println("yy is smaller than 13")
    }

    //Type
    val zz: Any = 13
    when(zz) {
        is String -> println(zz.uppercase())
        is Long -> zz.dec()
    }

    //Sealed
    val bb: Action = GoFoward()
    when(bb) {
        is GoBackward -> println("Back")
        is GoFoward -> println("Go")
        else -> println()

    }

    //Multiple
    val cc = when (listOf(12,14)) {
        listOf(12, 14) -> "Action 1"
        listOf(13, 14) -> "Action 2"
        else -> "Miau"
    }

    println(cc)

}
