package org.example.lesson_5

fun main() {
    var login = "Zaphod"
    var password = "PanGalactic"

    print("Введите свой логин: ")
    val localLogin = readln()
    if (localLogin == login) {
        print("Введите пароль: ")
        val localPassword = readln()
        if (localPassword == password) {
            println("Вам разрешено входить на борт корабля!")
        } else {
            println("Пароль неверный")
        }
    } else {
        println(
            """
            |Пользователь не найден.
            |Необходима регистрация.
        """.trimMargin()
        )
        print("Введите свой логин: ")
        login = readln()
        print("Введите пароль: ")
        password = readln()
        println("Вы успешно зарегистрированы!")
    }


}
