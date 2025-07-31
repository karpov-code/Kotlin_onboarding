package org.example.lesson_5

const val ACCEPTABLE_YEAR_OF_BIRTH = 2007

fun main() {
    val yearOfBirth = readln().toInt()
    if (yearOfBirth <= ACCEPTABLE_YEAR_OF_BIRTH) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ закрыт!")
    }

}