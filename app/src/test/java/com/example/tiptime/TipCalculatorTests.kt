package com.example.tiptime

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotSame
import org.junit.Test

class TipCalculatorTests {

    @Test
    fun calculateTip_15PercentRoundup(){
        val amount = 133.00
        val tipPercent = 0.20
        val rounded = true
        val expectedTip = 27.00
        val actual = calculateTip(amount, tipPercent, rounded)
        assertEquals(expectedTip, actual)
    }

    @Test
    fun calculateTip_25Percent(){
        val amount = 133.00
        val tipPercent = 0.25
        val rounded = false
        val expectedTip = 33.25
        val actual = calculateTip(amount, tipPercent, rounded)
        assertEquals(expectedTip, actual)
    }

    @Test
    fun calculateTip_100Percent(){
        val amount = 133.00
        val tipPercent = 1.00
        val rounded = true
        val expectedTip = 133.00
        val actual = calculateTip(amount, tipPercent, rounded)
        assertEquals(expectedTip, actual)
    }

    @Test
    fun verifyError(){
        val amount = 133.00
        val tipPercent = 0.25
        val rounded = false
        val expectedTip = 100.00
        val actual = calculateTip(amount, tipPercent, rounded)
        assertNotSame(expectedTip, actual)
    }
}