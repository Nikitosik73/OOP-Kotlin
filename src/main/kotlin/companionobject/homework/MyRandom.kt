package companionobject.homework

import kotlin.random.Random

class MyRandom {

    companion object {

        private const val pon = "Понедельник"
        private const val vto = "Вторник"
        private const val sre = "Среда"
        private const val chet = "Четверг"
        private const val pyt = "Пятница"
        private const val sub = "Суббота"
        private const val vsk = "Воскресенье"

        fun randomNumber(first: Int, second: Int) = Random.nextInt(first, second)

        fun randomBoolean() = Random.nextBoolean()

        fun randomDay(): String {
            val days = randomNumber(1, 8)
            return when (days) {
                1 -> pon
                2 -> vto
                3 -> sre
                4 -> chet
                5 -> pyt
                6 -> sub
                else -> vsk
            }
        }
    }
}