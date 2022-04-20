package com.zooplus.jrex.dia3

import kotlin.concurrent.thread

fun main() {

    //1 -> Java
    class SimpleThread: Thread() {
        override fun run() {
            ///code
        }
    }

    val st = SimpleThread()
    st.start()

    //2 -> Java
    class SimpleRunnable: Runnable {
        override fun run() {

        }
    }

    val sr = Thread(SimpleRunnable())
    sr.start()

    //3 -> Java 8

    val thr = Thread {
        println("One thread")
    }

    thr.start()

    //4 -> Kotlin
    val t = thread(start = false, isDaemon = false, contextClassLoader = null, name = "Kotlin Thread", priority = -1) {
        //Code
    }
    t.start()
}
