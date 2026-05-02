package com.example.algorithmskotlin

import org.junit.Assert.assertEquals
import org.junit.Test

class MaximumScoreTest {

    @Test
    fun sampleCase() {
        assertEquals(20L, getMaximumScore(intArrayOf(1, 5, 3, 7, 8)))
    }

    @Test
    fun allDaysCanBeChosen() {
        assertEquals(12L, getMaximumScore(intArrayOf(3, 4, 5, 3)))
    }

    @Test
    fun singleDayIsAllowed() {
        assertEquals(10L, getMaximumScore(intArrayOf(10)))
    }

    @Test
    fun choosesBestInvariantGroup() {
        assertEquals(8L, getMaximumScore(intArrayOf(5, 2, 4, 6, 8)))
    }
}
