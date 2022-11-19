package com.example.algorithmskotlin

fun main() {
//    println(twoSum(intArrayOf(2,7,11,15), 9).toList())
//    [3,2,4]
    println(twoSum(intArrayOf(3,2,4), 6).toList())

}


/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val results = mutableListOf<Int>()
    nums.forEachIndexed { index, item ->
        nums.forEachIndexed { index2, item2 ->
            if (index != index2 && item + item2 == target) {
                results.add(index)
                results.add(index2)
                return results.toIntArray()
            }
        }
    }
    return results.toIntArray()
}