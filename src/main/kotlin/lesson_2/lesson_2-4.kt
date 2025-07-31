package org.example.lesson_2

const val OPERATION_DIVIDATION_PERTS = 100

fun main() {
    val counterOfCrystalOre = 7
    val counterOfIronOre = 11
    val gameBuff = 20
    println("Бонусная кристаллическая руда ${counterOfCrystalOre * gameBuff / OPERATION_DIVIDATION_PERTS}")
    println("Бонусная железная руда ${counterOfIronOre * gameBuff / OPERATION_DIVIDATION_PERTS}")
}