package com.zooplus.jrex.dia3

inline fun myFun(str: String, myCall: (String) -> Unit) { //Inline = Reduce costs when called many times
    myCall(str)
}

fun main() {
    myFun("Duck", ::println)
}
