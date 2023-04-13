package anonymousclass.example

fun main() {

//    val car: Transport = Car("Машина")
//    val bike: Transport = Bike("Велосипед")
    // первый тип smart cast
//    if (car is Car) {
//        car.name = "Машина2"
//    }
    // второй тип smart cast
//    if (car !is Car) return
//    car.name = "Машина2"
//    println(car.name)
    // третий тип smart cast
//    if (car is Car && car.startEngine())
//    if (car !is Car || car.startEngine())
    // Анонимные классы
    travel(object : Transport("Автобус") {
        override fun drive() {
            println("Автобус едет...")
        }
    })
}

fun travel(transport: Transport) {
    transport.drive()
}