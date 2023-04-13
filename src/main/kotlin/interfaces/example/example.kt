package interfaces.example

fun main() {

    val workers = mutableListOf<Worker>()
    workers.add(Seller(name = "Artem", age = 20))
    workers.add(Programmer(name = "Nikita", age = 20, language = "Kotlin"))
    workers.add(Director(name = "Ilya", age = 20))

//    for (worker in workers) {
//        worker.works()
//        if (worker is Programmer) {
//            println(worker.language)
//        }
//        // чтобы у worker вызвать метод clean(), нужно сделать smart cast
          // оператор is используется для проверки объекта, является ли он объектом какого-то класса
          // оператор as используется для явного преобразования к камому-то типу
//        if (worker is Cleaner) {
//            worker.clean()
//        }
//    }

    // из коллекции работников получить коллекцию уборщиков
    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
    for (cleaner in cleaners) {
        cleaner.clean()
    }
}