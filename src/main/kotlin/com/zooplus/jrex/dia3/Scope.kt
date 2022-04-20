package com.zooplus.jrex.dia3

data class Person(val name: String, var old: Byte)

fun main() {

    val john = Person("John", 20)

    john.let {
        println(it) //Prints the whole person
        println(it.name)
    }

    john.run {
        println(this)
        println(this.name)
    }

    with(john) {
        println(this)
        println(this.name)
    }

    john.apply {
        println(this)
        println(this.name)
    }

    john.also {
        println(it)
        println(it.name)
    }
}
