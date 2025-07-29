package org.example.lesson_2

fun main(){
    val salaryOfWorkers: Int = 50 * 30000
    val totalSalary: Int = salaryOfWorkers + 30 * 20000
    val averageSalary: Int = totalSalary / (50 + 30)

    println(salaryOfWorkers)
    println(totalSalary)
    println(averageSalary)
}