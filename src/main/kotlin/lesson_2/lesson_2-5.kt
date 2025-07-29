package org.example.lesson_2
import kotlin.math.pow

fun main(){
    val initialAmount = 70000
    val  interestRate = 0.167
    val period = 20
    val totalAmountOfDeposit = initialAmount * ((1 + interestRate)).pow(period)
    println(String.format("%.3f", totalAmountOfDeposit))
}