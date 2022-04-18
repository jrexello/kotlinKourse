package com.zooplus.jrex.dia1

fun main(args: Array<String>) {
    myFun()
    myFun2()
    println(myFun3())
}

fun myFun() {
    println("No return here")
}

fun myFun2(): Unit {
    println("Unit means void")
}

fun myFun3(): String {
    return "Some String"
}
