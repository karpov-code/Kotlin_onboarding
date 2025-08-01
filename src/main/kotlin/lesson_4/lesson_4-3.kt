package org.example.lesson_4

fun main() {
    val weatherIsSunny = true
    val awningAtMoment = true
    val airHumidity = 20
    val season = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${weatherIsSunny && awningAtMoment && airHumidity == 20 && season != "зима"}"
    )
}