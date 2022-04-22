package com.zooplus.jrex.dia4

class OrderService(val db: Database) {

    fun doOrder(address: String?): Boolean {
        if(db.getNumberOrders() > 100) return false

        println("Doing order")
        return true
    }

}
