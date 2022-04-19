package com.zooplus.jrex.dia2

fun main() {
    var a = 12
    var b = 32
    var max = 0

    if (b > a)
        max = b
        //max = a //Won't reach. Only 1 line applied

    //inline
    max = if(a < b) b else a //The closest thing to ternary

}
