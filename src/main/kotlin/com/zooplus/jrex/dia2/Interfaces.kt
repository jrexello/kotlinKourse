package com.zooplus.jrex.dia2

interface Mammal { //No open needed

    fun sayHello() //No abstract needed
    fun giveMilk() = println("Here, have some milk")

}

fun main() {

    class Squirrel() : Mammal {
        override fun sayHello() {
            println("Hallooo")
        }
    }

    val s = Squirrel()
    s.sayHello()
    s.giveMilk()
}
