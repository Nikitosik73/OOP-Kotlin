package dataclass.example

fun main() {
    val student1 = Student("Nikita", "Paramonov", "1")
    val student2 = student1.copy()
//    val (name, lastName, id) = student1
    println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2) // сравниваем объекты
    println(student1 === student2) // сравниваем ссылки
}