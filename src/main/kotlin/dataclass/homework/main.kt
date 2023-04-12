package dataclass.homework

fun main() {

    val address = MyDataClassAddress("Moscow", "ProspectVer", "78")
    val address1 = address.copy()
    val (nameCity, streetName, numberOfHouse) = address

    println(nameCity)
    println(streetName)
    println(numberOfHouse)

    println(address)
    println(address1)
    println(address.hashCode())
    println(address1.hashCode())
    println(address == address1)
    println(address === address1)
}