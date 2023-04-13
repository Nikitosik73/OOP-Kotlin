package interfaces.homework

class Nikita(name: String, age: Int, val group: String) : Student(name, age), Worker {

    override fun example() {
        println("$name. Учусь в группе $group")
    }

    override fun work() {
        println("Сдаю практики")
    }
}