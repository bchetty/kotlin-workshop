package com.bchetty.koans

fun main(args: Array<String>) {
    val text1: String? = null
    println(text1 ?: "Text1 is Null!")
    val text2: String? = "Text2 is Not Null!"
    println(text2 ?: "Text2 is Null!")
}