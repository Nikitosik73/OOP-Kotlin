package bringing_in_OOP.example

class User {
    var name: String? = null
        get () {
            return if (field == null) {
                ""
            } else {
                field
            }
        }
    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}