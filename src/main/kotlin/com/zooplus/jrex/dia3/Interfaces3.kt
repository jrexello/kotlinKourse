package com.zooplus.jrex.dia3

interface Api { //No open needed
    fun doGet()
    fun doPost()
}

class RestApi: Api {
    override fun doGet() {
        println("Rest api => GET")
    }

    override fun doPost() {
        println("Rest api => POST")
    }
}

class ApiManager(
    private val restApi: RestApi = RestApi()
): Api by restApi {

}

fun main() {
    val a = ApiManager()

    a.doGet()
    a.doPost()
}
