package interfaces.example

import interfaces.example.Worker

class Director(name: String, age: Int) : Worker(name, age) {

    override fun works() {
        println("Управляю процессом")
    }
}