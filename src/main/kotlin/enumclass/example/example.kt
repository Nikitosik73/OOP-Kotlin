package enumclass.example

import enumclass.example.Month.*
import enumclass.example.Season.*

fun main() {
    val month = SEPTEMBER
    val result = when(month) {

        DECEMBER, JANUARY, FEBRUARY -> {
            WINTER
        }
        MARCH, APRIL, MAY -> {
            SPRING
        }
        JUNE, JULY, AUGUST -> {
            SUMMER
        }
       SEPTEMBER, OCTOBER, NOVEMBER -> {
            AUTUMN
        }
    }
    println("Средняя темпеутра $result равна ${result.tempAverage}")
}