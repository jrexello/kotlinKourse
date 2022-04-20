package com.zooplus.jrex.dia3

fun main() {

    data class Simple(val name: String, var legs: Int, var old: Byte) {
        fun getPrice() = "The value of $name is ${legs * 300}$"
    }

    val s = Simple("Jack", 2, 14)
    val s2 = Simple("Jack", 2, 14)

    println(s)
    println(s == s2) //Equals by content
    println(s === s2) //But not the same object

    s.legs = 1 //Sorry Jack
    println(s)

    val z = s.copy(name="Tom")
    println(z)
    println(z.getPrice())
    println(s2.getPrice())

}
