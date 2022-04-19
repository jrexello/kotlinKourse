package com.zooplus.jrex.dia2

import java.io.IOException

fun main() {

    //How to throw:
    //throw Exception("An Exception")

    //how to catch
    try {
        throw Exception("Another exception")
    } catch (ex: Exception) {
        println("An error occurred: ${ex.message}")
    } finally {
        println("Now go to sleep ZzZ")
    }

    val x = try { "Aa".toInt() } catch (ex: Exception) { -1 }
    println(x)

    fun fail(): Nothing {
        throw IOException("IO Error")
    }

    @kotlin.jvm.Throws(IOException::class)
    fun careful() = ""

}
