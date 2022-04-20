package com.zooplus.jrex.dia3

import kotlin.reflect.full.declaredMemberFunctions

fun main() {
    val a = listOf<String>()

    //a::class.declaredMemberFunctions

    for (mf in a::class.declaredMemberFunctions) {
        println(mf)
    }
}
