package com.zooplus.jrex.dia2

fun main() {
    val mutable = mutableListOf("Sora", "Donald", "Goofy")
    val securedList: List<String> = mutable //secured list is immutable

    println("SecuredList: $securedList")
    //securedList += "Mickey" => Error
    mutable += "Riku"
    println("SecuredList: $securedList")

}
