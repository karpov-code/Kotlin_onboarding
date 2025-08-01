package org.example.lesson_2

import java.util.*

fun main() {
    val sumOfMarks = (3 + 4 + 3 + 5).toFloat()
    val numberOfStudents = 4
    val arithmeticMean = sumOfMarks / numberOfStudents
    println(String.format(Locale.UK, "%.2f", arithmeticMean))
}