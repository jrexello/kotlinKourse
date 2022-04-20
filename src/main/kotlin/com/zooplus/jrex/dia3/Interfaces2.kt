package com.zooplus.jrex.dia3

interface Vehicle { //No open needed

    val wheels: Int
    var color: String

}

class Car: Vehicle {

    override val wheels: Int = 4
    override var color: String = "Black"

}

class MotorBike(override val wheels: Int = 2, override var color: String = "Red"): Vehicle

class Bike: Vehicle {
    override val wheels: Int
        get() = 2
    override var color: String
        get() = "Blue"
        set(value) {
            println("New color: $value")
        }
}

fun main() {

    val c = Car()
    c.wheels
    val m = MotorBike()
    m.wheels

}
