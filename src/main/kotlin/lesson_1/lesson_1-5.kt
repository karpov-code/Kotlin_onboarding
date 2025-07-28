package org.example.lesson_1

fun main() {
    val seconds: Short = 6480
    val minutes: Int = seconds / 60 //108

    val modifiedSeconds: Int = seconds % 60
    val hours: Int = minutes / 60
    val modifiedMinutes: Int = minutes % 60

    print(hours)
    print(":")
    print(modifiedMinutes)
    print(":")
    print(modifiedSeconds)
}


