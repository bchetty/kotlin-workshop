package com.bchetty.koans

fun eval1(expr: Expr1): Int =
    when (expr) {
        is Num1 -> expr.value
        is Sum1 -> eval1(expr.left) + eval1(expr.right)
    }

sealed interface Expr1
class Num1(val value: Int) : Expr1
class Sum1(val left: Expr1, val right: Expr1) : Expr1

fun main() {
    println("Number: ${eval1(Num1(42))}")
    println("Sum: ${eval1(Sum1(Num1(33), Num1(33)))}")
}