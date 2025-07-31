package org.example.lesson_5

fun main() {
    val firstWinningNumber = 17
    val secondWinningNumber = 31

    println(
        """
        |Чтобы выиграть полный приз угадайте два числа из диапазона [0..42]
        |Чтобы выиграть утешительный приз угадайте одно число из диапазона [0..42]  
    """.trimMargin()
    )

    print("Введите первое число: ")
    val firstNumber = readln().toInt()
    print("Введите второе число: ")
    val secondNumber = readln().toInt()

    if ((firstNumber == firstWinningNumber && secondNumber == secondWinningNumber)
        || (firstNumber == secondWinningNumber && secondNumber == firstWinningNumber)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((firstNumber == firstWinningNumber || secondNumber == secondWinningNumber)
        || (firstNumber == secondWinningNumber || secondNumber == firstWinningNumber)
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}
