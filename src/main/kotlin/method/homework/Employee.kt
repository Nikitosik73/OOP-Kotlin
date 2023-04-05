package method.homework

import java.util.Calendar

class Employee(val name: String, val jobTitle: String, val startYear: Int) {

    val experience: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work() {
        println("Работаю...")
    }
}