package extends.homework

class Programmer(name: String, age: Int, val language: String) : Employee(name, age) {

    override fun work() {
        println("Прогрммирую на языке $language")
    }
}