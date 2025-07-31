package org.example.lesson_1

const val TRANSLATION_IN_HOURS_AND_MINUTES = 60

fun main() {
    val totalNumberOfSeconds: Short = 6480
    val totalNumberOfMinutes: Int = totalNumberOfSeconds / TRANSLATION_IN_HOURS_AND_MINUTES

    val seconds = String.format("%02d", totalNumberOfSeconds % TRANSLATION_IN_HOURS_AND_MINUTES)
    val hours = String.format("%02d", totalNumberOfMinutes / TRANSLATION_IN_HOURS_AND_MINUTES)
    val minutes = String.format("%02d", totalNumberOfMinutes % TRANSLATION_IN_HOURS_AND_MINUTES)

    println("$hours:$minutes:$seconds")
}


