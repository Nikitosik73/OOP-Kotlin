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
}