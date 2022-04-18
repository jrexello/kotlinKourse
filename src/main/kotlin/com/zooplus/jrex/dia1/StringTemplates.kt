package com.zooplus.jrex.dia1

fun main() {
    val name: String = "Donald"
    val name2 = "   Donald     "

    println("The fucking $name the Duck") //String.format() in Java
    println("The fucking ${name.uppercase()} the Duck")
    println("The fucking ${if (name.length == 0) "<empty>" else name.uppercase()} the Duck")

    //Escape
    println("The fucking \$name the Duck")
    println("The fucking \\\$name the Duck")
}
