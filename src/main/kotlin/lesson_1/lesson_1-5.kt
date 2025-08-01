package org.example.lesson_1

const val TRANSLATION_IN_HOURS_AND_MINUTES = 60

fun main() {
    val totalNumberOfSeconds: Short = 6480
    val totalNumberOfMinutes: Int = totalNumberOfSeconds / TRANSLATION_IN_HOURS_AND_MINUTES
    val seconds = totalNumberOfSeconds % TRANSLATION_IN_HOURS_AND_MINUTES
    val hours = totalNumberOfMinutes / TRANSLATION_IN_HOURS_AND_MINUTES
    val minutes = totalNumberOfMinutes % TRANSLATION_IN_HOURS_AND_MINUTES

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}


