package com.bchetty.koans

fun main(args: Array<String>) {
    println(joinOptions(listOf("a","b","c")))
}

fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", postfix = "]")