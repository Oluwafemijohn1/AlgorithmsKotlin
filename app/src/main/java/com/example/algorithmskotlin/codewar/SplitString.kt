package com.example.algorithmskotlin.codewar

fun main() {
    println(solution("abc"))
    println(solution("abcdef"))

}

/**
 * Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters then it should replace the
 * missing second character of the final pair with an underscore ('_').
 * e.g * 'abc' =>  ['ab', 'c_']
 * 'abcdef' => ['ab', 'cd', 'ef']
 * */

fun solution(s: String): List<String> {
    return s.chunked(2).map {
        if (it.length == 1) it + "_" else it
    }
}