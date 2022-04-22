package com.zooplus.jrex.dia4

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun demo(x: MutableList<String>, count: Int): Unit { //Suspend: Necessary for using in coroutines
    println("Starting demo $count")
    delay(2000)
    x.add("New Element")
    println("Ending demo $count")
}

fun main() {

    println("System: Start!")
    val x = mutableListOf<String>()

    runBlocking {

        for(i in 1.. 2000000)
        launch { demo(x, i) }

    }

    println("System: End. Size: ${x.size}")

}
