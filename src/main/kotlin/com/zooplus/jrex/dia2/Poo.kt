package com.zooplus.jrex.dia2

//public class Bear() //min
/*public class Grizzle() {
    fun salute() = println("Rawr")
}*/

/*public class Panda() {
    val name: String = "Po"
}*/

class PolarBear(private val name: String) {
    fun salute() = println("Polar Rawr. My name is $name")
}

//To allow inheritance: use "Open"
open class Bear(
    val name: String,
    val color: String
    ) {
    open fun salute() = println("Rawr")
}

class Grizzle(name: String): Bear(name, "Black") {
    override fun salute() = println("Grrraw")
}

class Panda(name: String = "Po"): Bear(name, "Black and White")

fun main() {
    val y = Grizzle("Gerard")
    y.salute()
    val z = Panda()
    println(z.name)
    val a = PolarBear("White")
    a.salute()
}
