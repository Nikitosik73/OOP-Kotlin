package interfaces.homework

class Alex(name: String, age: Int, val group: String) : Student(name, age) {

    override fun example() {
        println("$name. Учусь в группе $group")
    }
}