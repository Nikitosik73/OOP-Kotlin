package extends.homework

fun main() {

    val employees = mutableListOf<Employee>()
    employees.add(Employee("Oleg", 20))
    employees.add(Programmer(name = "Nikita", age = 20, language = "Kotlin"))

    for (employee in employees) {
        employee.work()
    }
}