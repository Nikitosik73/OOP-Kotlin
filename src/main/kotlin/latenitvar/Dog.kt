package latenitvar

class Dog {
    // lateinit - поздняя инициализация
    private lateinit var a: String

    fun printA() {
        println(a)
        println(a.length)
    }
}