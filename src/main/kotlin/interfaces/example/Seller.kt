package interfaces.example

class Seller(name: String, age: Int) : Worker(name, age), Cleaner {

    override fun works() {
        println("Продаю товар")
    }

    override fun clean() {
        println("Продавец $name убирает своё рабочее место")
    }
}