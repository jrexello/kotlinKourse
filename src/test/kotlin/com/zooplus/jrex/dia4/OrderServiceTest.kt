package com.zooplus.jrex.dia4

import org.junit.jupiter.api.Test
import org.mockito.kotlin.*
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class OrderServiceTest {

    @Test
    fun do_an_order() {
        val dbMock = mock<Database> {
            on {
                getNumberOrders()
            } doReturn 1
        }

        val service = OrderService(dbMock)
        val result = service.doOrder("Miau")

        assertTrue { result }
        verify(dbMock, times(1)).getNumberOrders()
    }

    @Test
    fun do_an_order_and_db_has_too_many_orders() {
        val dbMock = mock<Database>()
        whenever(dbMock.getNumberOrders()).thenReturn(200)

        val service = OrderService(dbMock)
        val result = service.doOrder("Miau")

        assertFalse { result }
        verify(dbMock, times(1)).getNumberOrders()
    }
}
