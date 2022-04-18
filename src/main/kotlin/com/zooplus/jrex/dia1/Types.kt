package com.zooplus.jrex.dia1

fun main() {
    var x: Any // Class Object

    //Numeric
    var a: Int = 1 //Here there's no primitive types
    var b: Short = 1

    var c = 1 //By Default is an Int
    var d = 1L //By Default is a Long if the L is added
    var e = 900000000000 //If the number is long as hell, by default is a long

    //Decimal
    var f: Float = 1.1F //32 bits
    var g: Double = 1.1 //64 bits
    var h = 1.1 //By default, is Double
    var h1 = 1.2e10

    //Strings
    var i: String = "Aguacate"
    var i2 = "Duck" // By default, is a String
    var j: Char = 'a'
    var j2 = 'a' //By default, is a Char

    //Bools
    var k: Boolean = true
    var k2 = false

    //Arrays
    var l: Array<Int> = arrayOf(1, 2, 3, 4, 5)


}
