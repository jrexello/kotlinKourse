package com.zooplus.jrex.dia3

class Outer {
    private val foo = 13
    inner class Inner {
        fun seeFoo() = foo
    }
}

//Nested
class Airport(private val code: String) {
    open class Plane {
        fun contact(airport: Airport) = "Contacting with ${airport.code}"
    }

    private class PrivatePlane: Plane()
    fun privatePlane(): Plane = PrivatePlane()
}

fun main() {
    val o = Outer().Inner() //Cant do "Outer.Inner()"
    println(o.seeFoo())

    //Nested
    val mad = Airport("MAD")
    val plane = Airport.Plane()
}
