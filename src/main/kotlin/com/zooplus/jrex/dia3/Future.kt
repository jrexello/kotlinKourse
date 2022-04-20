package com.zooplus.jrex.dia3

import java.util.concurrent.CompletableFuture

fun main() {

    fun giveFuture(): CompletableFuture<Int> {
        val f = CompletableFuture.supplyAsync {
            println("My future")
            Thread.sleep(2000)
            12
        }
        return f
    }

    val f = giveFuture()

    //val rs = f.get()
    //println(rs)

    f.thenApply { println("Future fulfilled $it") }
}
