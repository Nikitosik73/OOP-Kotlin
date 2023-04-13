package anonymousclass.example

class Car(override var name: String = "Машина") : Transport(name) {

    override fun drive() {
        println("Машина едет")
    }

    fun startEngine(): Boolean {
        println("Двигатель запущен...")
        return true
    }
}