package com.example.algorithmskotlin

import android.os.Build
import androidx.annotation.RequiresApi

//class MissionAlgorithms {
//}

fun main() {
//println(solution(intArrayOf(1, 2, 3, -4, 5, 8)))
//    println(solution2(512, 10))
    println(solution2(285, 20))

}

fun solution(A: IntArray): Int {
    // return the sum of all integers that are multiples of 4
    return A.filter { Math.abs(it) % 4 == 0 }.sum()

}

fun solution2(N: Int, K: Int): Int {
    // return maximum possible three-digit value that can be obtained
// by performing K increments by 1 of any digit in N
    var intArr = N.toString().toCharArray().map { it.toString().toInt() }
    var list = intArr.toMutableList()
    var tempK = K
   for(i in intArr.indices) {
       if(intArr[i] <= 9){
           if (tempK > 9){
               list[i] =  intArr[i] + (9 - intArr[i])
               tempK -= (9 - intArr[i])
           } else{
               list[i] = intArr[i] + tempK
               break
           }

       }
   }
    return list.joinToString("").toInt()
}
