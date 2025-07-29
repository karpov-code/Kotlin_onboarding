package org.example.lesson_3

fun main(){
    val string = "D2-D4;0"
    val result  = string.split("-", ";")
    val whereFrom = result[0]
    val where = result[1]
    val strokeNumber = result[2]
    println("""
        $whereFrom
        $where
        $strokeNumber
    """.trimIndent())
}