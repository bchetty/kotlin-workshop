package com.bchetty.koans

fun main(args: Array<String>) {
    val listWithNulls: List<Int?> = listOf(null,1,2,null,4,5,null)
    val filteredIntList: List<Int> = listWithNulls.filterNotNull()
    println("Fitered List: $filteredIntList")
}

