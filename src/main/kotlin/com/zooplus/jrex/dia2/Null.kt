package com.zooplus.jrex.dia2

fun main() {
    var fox: String = "Fox"
    //fox = null //Can't. Nulls are not allowed

    var wolf: String? = "Wolf"
    wolf = null //Ok. Nulls are allowed here

    var bird: String
    if (wolf != null) {
        bird = "Bird"
    } else {
        bird = "Another Bird"
    }

    //println(wolf.length) => Can't. Could be null
    println(wolf?.length) //Ok. Elvis check. Will return null

    wolf = "Wolf"
    println(wolf?.length)

    //Elvis checks can be concatenated: forest?.wood?.tree?.branch?.nest

    //val list: List<String> = listOf("Fish", null, "Chameleon") => Can't nulls not allowed
    val list: List<String?> = listOf("Fish", null, "Chameleon") //OK

    println("For start")
    for (item in list) {
        println(item?.length) //This will "print" the nulls. Problematic
    }

    println("Second for start")
    for (item in list) {
        item?.let {println(it) } //This will "print" only the not nulls
    }

    val elvis = wolf?.length ?: -1 //The new ternary operator
    //val elvis = wolf?.length : -1 //This won't work
    println(elvis)

    val noWolf: String? = null
    println("!! wolf => ${wolf!!.length}") //Will work
    //println("!! noWolf => ${noWolf!!.length}") //NullPointer

    //Secure casting
    val noFox = fox as? String //Now is nullable
    val forest: List<String?> = listOf("Rat", null, "Bird", "Fox")
    println(forest.filterNotNull())

}
