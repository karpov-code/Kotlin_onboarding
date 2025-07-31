package org.example.lesson_4

fun main() {
    val damageShipHull = readln().toBoolean()
    val numberOfCrew = readln().toInt()
    val numberOfBoxesWithProvisions = readln().toInt()
    val favorableWeatherConditions = readln().toBoolean()

    if ((!damageShipHull && (numberOfCrew >= 55 && numberOfCrew <= 70) && (numberOfBoxesWithProvisions > 50))
        || ((numberOfCrew == 70) && (favorableWeatherConditions) && (numberOfBoxesWithProvisions >= 50))
    ) {
        println("Разрешено приступить у долгосрочному плаванию!")

    } else {
        println("Отказано приступить к долгосрочному плаванию!")
    }
}