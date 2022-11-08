package com.bchetty.koans

fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun main() {
    println("Number: ${eval(Num(42))}")
    println("Sum: ${eval(Sum(Num(33), Num(33)))}")
}