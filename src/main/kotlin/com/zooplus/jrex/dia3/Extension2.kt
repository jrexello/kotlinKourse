package com.zooplus.jrex.dia3

data class Balance(var internalBalance: Double)

operator fun Balance.plus(inc: Double) {
    this.internalBalance = this.internalBalance + inc
}

infix fun Balance.customAdd(inc: Double) {
    this.internalBalance += inc
}

fun main() {
    val x = Balance(0.0)
    x + 3.5 //Only will work after the operator
    println(x.internalBalance)
    println(x.customAdd(5.0))
}
