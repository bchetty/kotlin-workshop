package com.bchetty.koans

fun main() {
    val collection1: Collection<Int> = listOf(1,2,3,4,5)
    println(containsEven(collection1))

    val collection2: Collection<Int> = listOf(1,3,5,7,9)
    println(containsEven(collection2))

    val collection3: Collection<Int> = listOf(2,4,6,8,10)
    println(containsEven(collection3))
}

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0}