package com.zooplus.jrex.dia2

class Animal(var name: String) { //Extends Any

    var legs = 0

    constructor(name: String, legs: Int): this(name) {
        this.legs = legs
    }

    fun show() = println("My name is $name and I have $legs legs")

    override fun toString(): String {
        return "Animal(Legs: $legs, Name: $name)"
    }

}

fun main() {
    val a = Animal("Donald")
    val b = Animal("Goofy", 2)

    a.show()
    b.show()
    println(b)
}
