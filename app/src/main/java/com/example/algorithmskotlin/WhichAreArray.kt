package com.example.algorithmskotlin

fun main() {
//    println(inArray(arrayOf("arp", "live", "strong"), arrayOf("lively", "alive", "harp", "sharp", "armstrong")).toList())
    println(inArray2(arrayOf("arp", "live", "strong"), arrayOf("lively", "alive", "harp", "sharp", "armstrong")).toList())
}
/**
 * Given two arrays of strings a1 and a2 return a sorted array r
 * in lexicographical order of the strings of a1 which are substrings of strings of a2.
 * e.g.
 * a1 = ["arp", "live", "strong"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns ["arp", "live", "strong"]
 * */

fun inArray(array1: Array<String>, array2: Array<String>): Array<String> {
//    return array1.filter{e->array2.any{it.contains(e)}}.distinct().sorted().toTypedArray()
//    return array1.filter { array2.joinToString(" ").contains(it) }.toSortedSet().toTypedArray()
//    return array1.filter(array2::anyContains).toSortedSet().toTypedArray()
//    return array1.filter { array2.any { it.contains(it) } }.toSortedSet().toTypedArray()
   return  array1.toSortedSet().filter { it in array2.joinToString() }.toTypedArray()
}

private fun Array<String>.anyContains(s: String) = any { it.contains(s) }

fun inArray2(array1: Array<String>, array2: Array<String>): Array<String> {
    //...
//    val result = array2.flatMap { arr2 ->
//        array1.filter { arr1 ->
//            arr1 in arr2  }
//    }.toSet().sorted().toTypedArray()
    return array2.flatMap { arr2 ->
        array1.filter { arr1 ->
            arr1 in arr2  }
    }.toSet().sorted().toTypedArray()
}