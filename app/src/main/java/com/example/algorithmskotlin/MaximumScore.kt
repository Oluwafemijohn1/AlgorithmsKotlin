package com.example.algorithmskotlin

fun main() {
    println(getMaximumScore(intArrayOf(1, 5, 3, 7, 8)))
}

fun getMaximumScore(stockPrice: IntArray): Long {
    val groupSums = HashMap<Long, Long>()
    var bestScore = 0L

    for (day in stockPrice.indices) {
        val key = stockPrice[day].toLong() - day.toLong()
        val updatedSum = (groupSums[key] ?: 0L) + stockPrice[day].toLong()
        groupSums[key] = updatedSum
        if (updatedSum > bestScore) {
            bestScore = updatedSum
        }
    }

    return bestScore
}
