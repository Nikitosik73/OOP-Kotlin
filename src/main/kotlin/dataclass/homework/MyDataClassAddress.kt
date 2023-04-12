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
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MyDataClassAddress

        if (nameCity != other.nameCity) return false
        if (streetName != other.streetName) return false
        if (numberOfHouse != other.numberOfHouse) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nameCity.hashCode()
        result = 31 * result + streetName.hashCode()
        result = 31 * result + numberOfHouse.hashCode()
        return result
    }
}