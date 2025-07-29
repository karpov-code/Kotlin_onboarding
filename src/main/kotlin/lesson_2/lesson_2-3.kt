package org.example.lesson_2

fun main(){
    val minutesOfDeparture: Int = (9*60 + 39)
    val totalMinutesOfArrival: Int = minutesOfDeparture + 457
    val hoursOfArrival: Int = totalMinutesOfArrival / 60
    val minutesOfArrival: Int =  totalMinutesOfArrival % 60

    print(hoursOfArrival)
    print(":")
    print(minutesOfArrival)
}