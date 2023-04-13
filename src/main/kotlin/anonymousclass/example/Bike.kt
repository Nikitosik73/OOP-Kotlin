package anonymousclass.example

class Bike(name: String) : Transport(name) {

    override fun drive() {
        println("Велосипед едет")
    }
}