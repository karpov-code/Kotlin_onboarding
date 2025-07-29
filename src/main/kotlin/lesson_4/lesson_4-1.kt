package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main(){
    val reservedtTablesToday = 13
    val reservedTablesTomorrow = 9

    println("Доступность столиков на сегодня: ${reservedtTablesToday < NUMBER_OF_TABLES}")
    println("Доступность столиков на завтра: ${reservedTablesTomorrow < NUMBER_OF_TABLES}")
}