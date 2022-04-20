package com.zooplus.jrex.dia3

fun <T> describe(obj: T) {
    when(obj) {
        is String -> println(obj)
        is Int -> println(obj.inc())
        else -> println("Nya~~")
    }
}

fun main() {
    describe("Bu")
    describe(12)
    describe(12.0)

    class GenericDog<T> {
        fun <Y> show(arg: T, arg2: Y): Y = arg2
    }

    class GenericDog2<T>(a: T)

    val x = GenericDog<String>()
    x.show("Guau", 12)

    //val z: Int = x.show("Nya", "13") //Fails. He knows
    val z: Int = x.show("Nya", 13)

    val a = GenericDog<Double>()
    a.show(1.1, "Miau")

    GenericDog2(12L)
}
