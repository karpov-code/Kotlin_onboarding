package org.example.lesson_5

fun main() {
    val number_1 = 10
    val number_2 = 20
    print(
        """
        Решите, предложенный ниже пример:
        $number_1 + $number_2 = 
    """.trimIndent()
    )
    val userAnswer = readln().toInt()
    if (userAnswer == number_1 + number_2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}