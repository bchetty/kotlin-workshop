package com.bchetty.koans

fun main(args: Array<String>) {
    //Use "Fold" technique and add first 100 numbers, with BruteForce approach
    val sum: Int = IntRange(1, 100).fold(0) {sum, element -> sum + element}
    println("Sum: $sum")

    val list: List<Int> = listOf(1,2,3,4,5)
    val initVal: Int = 100

    println("Fold and Add first 5 Ints with a Initial-Value of 100: ${foldIt(list, initVal)}")
    println("Reduce and Add first 5 Ints (No Initial-Value): ${reduceIt(list)}")
}

fun foldIt(list: List<Int>, initVal: Int): Int {
    return list.fold(initVal) { sum, element -> sum + element}
}

fun reduceIt(list: List<Int>): Int {
    return list.reduce() { sum, element -> sum + element}
}