package com.zooplus.jrex.dia4

import kotlin.test.Test

class CalculatorTest {

    @Test
    fun add_two_ints() {

        val x = 1
        val y = 3
        val cal = Calculator()

        val result = cal.add(x, y)

        assert(result == 4)
        assert(result == (x + y))

    }

}
