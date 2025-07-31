package org.example.lesson_2

const val MINUTES_IN_AN_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val minutesWay = 457
    val minutesOfDeparture: Int = (departureHour * MINUTES_IN_AN_HOUR + departureMinute)
    val totalMinutesOfArrival: Int = minutesOfDeparture + minutesWay
    val hoursOfArrival = String.format("%02d", (totalMinutesOfArrival / MINUTES_IN_AN_HOUR))
    val minutesOfArrival = String.format("%02d", totalMinutesOfArrival % MINUTES_IN_AN_HOUR)

    println("$hoursOfArrival:$minutesOfArrival")
}