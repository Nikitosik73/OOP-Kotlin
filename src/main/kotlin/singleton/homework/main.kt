package singleton.homework

fun main() {

    val db = MySingleTon.getInstance()
    db.insertData(string = "Nikita")
    db.insertData(string = "Oleg")
    for (data in db.dataName) {
        println(data)
    }
}