package interfaces.homework

fun main() {

    val students = mutableListOf<Student>()
    students.add(Nikita(name = "Nikita", age = 20, group = "IKBO-26-20"))
    students.add(Oleg(name = "Oleg", age = 20, group = "IKBO-20-20"))
    students.add(Alex(name = "Alex", age = 20, group = "IKBO-25-20"))

    students.forEach {
        it.example()
        if (it is Worker) {
            it.work()
        }
    }

    val workers = students.filter { it is Worker }.map { it as Worker }
    workers.forEach {
        it.work()
    }
}