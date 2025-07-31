package org.example.lesson_4

fun main() {
    var weightCargo: Int
    var volumeCargo: Int

    //пример 1
    weightCargo = 20
    volumeCargo = 80
    println(
        "Груз с весом $weightCargo кг и объемом $volumeCargo л соответствует категории 'Average': " +
                "${(weightCargo > 35 && weightCargo <= 100) && (volumeCargo < 100)}"
    )

    //пример 2
    weightCargo = 50
    volumeCargo = 100
    println(
        "Груз с весом $weightCargo кг и объемом $volumeCargo л соответствует категории 'Average': " +
                "${(weightCargo > 35 && weightCargo <= 100) && (volumeCargo < 100)}"
    )

}