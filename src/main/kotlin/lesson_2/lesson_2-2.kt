package org.example.lesson_2

fun main() {
    val numberWorkerOfCompany = 50
    val workerSalary = 30000
    val numberInternsOfCompany = 30
    val internSalary = 20000

    val salaryOfWorkers: Int = numberWorkerOfCompany * workerSalary
    val totalSalary: Int = salaryOfWorkers + numberInternsOfCompany * internSalary
    val averageSalary: Int = totalSalary / (numberWorkerOfCompany + numberInternsOfCompany)

    println(salaryOfWorkers)
    println(totalSalary)
    println(averageSalary)
}