package interfaces.example

class Programmer(name: String, age: Int, val language: String) : Worker(name, age), Cleaner {

    override fun works() {
        println("Пишу код на языке $language")
    }

    override fun clean() {
        println("Программист $name убирает своё рабочее место")
    }
}