package dataclass.example


/*
    Отличие DataClass от обычного Class, в том что
    переопределены следующие методы:
    equals()
    hashCode()
    toString()
    copy()
    Деструктивные операторы componentN
 */
class Student(val name: String, val lastName: String, val id: String) {

    fun copy(
        name: String = this.name,
        lastName: String = this.lastName,
        id: String = this.id,
    ): Student {
        return Student(name, lastName, id)
    }
}