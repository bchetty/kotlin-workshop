package com.bchetty.koans

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class JoinStringsTest {
    @Test
    fun testCase1() {
        val result: String = joinOptions(listOf("a","b","c"))
        assertEquals("[a, b, c]", result)
    }

    @Test
    fun testCase2() {
        val result: String = joinOptions(listOf("a","b","c", "d", "e"))
        assertEquals("[a, b, c, d, e]", result)
    }
}