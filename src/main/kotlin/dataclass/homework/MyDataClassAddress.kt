package dataclass.homework

class MyDataClassAddress(
    val nameCity: String,
    val streetName: String,
    val numberOfHouse: String
) {
    operator fun component1() = nameCity
    operator fun component2() = streetName
    operator fun component3() = numberOfHouse

    fun copy(
        nameCity: String = this.nameCity,
        streetName: String = this.streetName,
        numberOfHouse: String = this.numberOfHouse
    ): MyDataClassAddress {
        return MyDataClassAddress(nameCity, streetName, numberOfHouse)
    }

    override fun toString(): String {
        return "nameCity: $nameCity, streetName: $streetName, numberOfHouse: $numberOfHouse"
    }

    override fun equals(other: Any?): Boolean {
        // проверяем ссылки
        if (this === other) return true
        // проверяем объекты
        if (hashCode() != other.hashCode()) return false

        other as MyDataClassAddress

        return !(nameCity != other.nameCity && streetName != other.streetName && numberOfHouse != other.numberOfHouse)
    }

    override fun hashCode(): Int {
        return nameCity.hashCode() + streetName.hashCode() + numberOfHouse.hashCode()
    }
}