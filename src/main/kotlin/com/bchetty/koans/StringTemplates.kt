package com.bchetty.koans

fun main(args: Array<String>) {
    println("13 JUN 1992".matches(getPattern().toRegex()))
}

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2}\ ${month}\ \d{4}"""