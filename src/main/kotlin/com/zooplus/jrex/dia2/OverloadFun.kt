package com.zooplus.jrex.dia2

fun main() {
    /*fun a(x:Int) = println("Call with parameter $x")
    fun a() = println("Call with no parameter")*/
    //Best use this:
    fun a(x:Int = 12) = println("Call with parameter $x")

    a()
    a(12)

    fun b(x: Int) = x
    fun b(x: Double) = x.toInt()
    fun b(x: String) = x.toInt()
    fun b(x: Boolean): String = x.toString()

    println(b(1))
    println(b(2.0))
    println(b("3"))
    println(b(true))

}
