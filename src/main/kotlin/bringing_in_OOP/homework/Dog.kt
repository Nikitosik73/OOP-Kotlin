package bringing_in_OOP.homework

class Dog {

    var name: String? = null
        get() = field?.capitalize()
    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var weight: Double = 0.0
        set(height) {
            if (height >= 0) {
                field = height
            }
        }
}