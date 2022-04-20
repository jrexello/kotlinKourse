package com.zooplus.jrex.dia3

import arrow.core.None
import arrow.core.Option
import arrow.core.Some
import arrow.core.some

fun getRowFromDB(id: Int): Option<String> {
    if(id < 20) {
        return Some("Row $id")
    }
    return None
}

fun main() {
    val a: Option<String> = None
    //val b: Option<String> = Some("Halloo") //Is valid
    val b: Option<String> = "Halloo".some()

    val x: Option<String> = getRowFromDB(2)

    when(x) {
        is Some -> println(x.value)
        is None -> println("No row retrieved")
    }
}
