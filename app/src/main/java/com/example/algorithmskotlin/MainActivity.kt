package com.example.algorithmskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.abs

fun main(){
//    println(diagonalDifference(arrayOf(arrayOf(11, 2, 4),arrayOf(4, 5, 6),arrayOf(10, 8, -12))))
    println(plusMinus(arrayOf(-4, 3, -9, 0, 4, 1)))

    println(marsExploration("SOSTOT"))
}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
   return arr.let {
         val leftToRight = it.mapIndexed { index, value ->
             value[index]
         }.sum()
         val rightToLeft = it.mapIndexed { index, value ->
             value[it.size - index - 1]
         }.sum()
         Math.abs(leftToRight - rightToLeft)

   }
}


/*
* Given an array of integers, calculate the ratios of its elements that are positive,
*  negative, and zero. Print the decimal value of each fraction on a new line with
* places after the decimal.
* */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    val negative = arr.count { it < 0 }.toFloat() / arr.size
    val positive = arr.count { it > 0 }.toFloat() / arr.size
    val zero = arr.count { it == 0 }.toFloat() / arr.size
    println(String.format("%.6f", negative))
    println(String.format("%.6f", positive))
    println(String.format("%.6f", zero))
}

/**
 * A space explorer's ship crashed on Mars! They send a series of SOS messages to Earth for help.
 * Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string,
 * , s, determine how many letters of the SOS message have been changed by radiation.
 * */

fun marsExploration(s: String): Int {
    // Write your code here
    val sos = "SOS"
    var count = 0
    for (i in 0 until s.length step 3) {
        if (s.substring(i, i + 3) != sos) {
            s.subSequence(i, i + 3).forEachIndexed { index, c ->
                if (c != sos[index]) {
                    count++
                }
            }
        }
    }
    return count
}
