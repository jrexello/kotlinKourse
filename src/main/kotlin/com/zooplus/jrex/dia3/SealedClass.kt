package com.zooplus.jrex.dia3

abstract sealed class ActionAbstract
sealed class ActionClass
sealed interface Action

//Implementation
class GoFoward: Action
class GoBackward: Action
class GoUp: Action
class GoDown: Action

fun main() {
    val a: Action = GoDown()

    when(a) {
        is GoDown -> println("Going down")
        is GoUp -> println("Going Up")
        is GoBackward -> println("Going Back")
        //is GoFoward -> println("Going through")
        else -> println("Going through")
    }
}
