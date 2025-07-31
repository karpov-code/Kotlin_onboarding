package org.example.lesson_2

import kotlin.math.pow
import java.util.Locale

const val OPERATION_DIVIDATION_PERTS = 100

fun main() {
    val initialAmount = 70000
    val interestRate = 16.7
    val period = 20
    val totalAmountOfDeposit = initialAmount * ((1 + interestRate / OPERATION_DIVIDATION_PERTS)).pow(period)
    println("%.3f".format(Locale.US, totalAmountOfDeposit))
}