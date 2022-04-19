package com.zooplus.jrex.dia2

object JustOne { //Singleton. There will only be one

    var n = 2

    fun f() = n *10
    fun g() = this.n *10

}

class WithCompanion {
    var n = 12

    companion object { //Static object shared by all the instances
        var w = 0
    }

    fun inc() {
        w ++
    }
}

fun main() {

    //val x = JustOne() => Error
    val x = JustOne //Just an Alias

    println(x.f())
    x.n = 10
    println(JustOne.g())

    val b = WithCompanion()

    println(WithCompanion.w)
    b.inc()
    println(WithCompanion.w)

}
