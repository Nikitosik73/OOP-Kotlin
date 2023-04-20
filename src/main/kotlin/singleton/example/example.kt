package singleton.example

fun main() {

    val database = Database
    database.insert("1")
    database.insert("2")
    val test = Test()
    test.insertTestData("3")
    test.insertTestData("4")

    for (db in database.data) {
        println(db)
    }
}