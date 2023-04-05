package method.example

fun main() {
    val cat = Cat(name = "Barsik", age = 1, weight = 3f)
    println(cat.isOld)
    cat.age = 12
    println(cat.isOld)
}