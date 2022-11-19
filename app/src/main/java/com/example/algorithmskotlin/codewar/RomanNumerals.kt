package com.example.algorithmskotlin.codewar

//@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    println(romanNumerals(423))
}

//@RequiresApi(Build.VERSION_CODES.O)
fun romanNumerals(num: Int): String {
    val roman = arrayOf(
        arrayOf("M", 1000),
        arrayOf("CM", 900),
        arrayOf("D", 500),
        arrayOf("CD", 400),
        arrayOf("C", 100),
        arrayOf("XC", 90),
        arrayOf("L", 50),
        arrayOf("XL", 40),
        arrayOf("X", 10),
        arrayOf("IX", 9),
        arrayOf("V", 5),
        arrayOf("IV", 4),
        arrayOf("I", 1)
    )
    var result = ""
    var num2 = num
    roman.forEachIndexed { _, p ->
        while (num2 >= p[1] as Int) {
            result += p[0]
            num2 -= p[1] as Int
        }
    }
//        while (num >= p[1] as Int) {
//            result += p[0]
//            num -= p[1] as Int
//        }
//    }
//    for (i in roman.indices) {
//        while (num >= roman[i][1] as Int) {
//            result += roman[i][0]
//            num -= roman[i][1] as Int
//        }
//    }
    return result
}
