package com.zooplus.jrex.dia3

import arrow.core.Eval

fun main() {
    fun logger(x: Int): Int {
        println("Log - $x")
        return x
    }

    val now = Eval.now(logger(1))

    var counter = 0
    val map = now.map { logger(counter++); it+1 }
    println("Counter now 1 => $counter")

    var secondEx = map.value()
    println("Counter now 2 => $counter and secondEx => $secondEx")
    secondEx = map.value()
    println("Counter now 3 => $counter and secondEx => $secondEx")

    secondEx = 0
    counter = 0
    val later = Eval.later { logger(counter++); counter }

    println("Counter later 1 => $counter and secondEx => $secondEx")
    secondEx = later.value
    println("Counter later 2 => $counter and secondEx => $secondEx")
    secondEx = later.value
    println("Counter later 3 => $counter and secondEx => $secondEx")
    secondEx = later.value
    println("Counter later 4 => $counter and secondEx => $secondEx")

    counter = 0
    secondEx = 0
    val always = Eval.always { logger(counter++); counter }

    secondEx = always.value()
    println("Counter always 1 => $counter and secondEx => $secondEx")
    secondEx = always.value()
    println("Counter always 2 => $counter and secondEx => $secondEx")
    secondEx = always.value()
    println("Counter always 3 => $counter and secondEx => $secondEx")
    secondEx = always.value()
    println("Counter always 4 => $counter and secondEx => $secondEx")

}
