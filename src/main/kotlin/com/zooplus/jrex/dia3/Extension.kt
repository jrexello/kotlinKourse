package com.zooplus.jrex.dia3

data class Cat(val name: String)

///This could be another file
fun Cat.showName() = println("Ma name is $name. Nyaa~~")
fun String.myCustomSum(): Int = this.length

fun main() {
    val c = Cat("Lance")
    c.showName()
    println(c.name.myCustomSum())
}
