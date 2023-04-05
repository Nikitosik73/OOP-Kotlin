package method.example

class Cat(val name: String, var age: Int, val weight: Float = 0f) {

    val isOld: Boolean
        get() = age >= 12

    fun printInfo() {
        println("Name: $name, Age: $age, Weight: $weight")
    }
}