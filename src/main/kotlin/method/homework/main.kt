package method.homework

fun main() {
    val employee = Employee(name = "Nikita", jobTitle = "Android Developer", startYear = 2022)
    employee.work()
    println(employee.experience)
    employee.printInfo()
}

fun Employee.printInfo() {
    println("Name: $name, JobTitle: $jobTitle, Year: $startYear")
}