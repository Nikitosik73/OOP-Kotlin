package singleton.example

object Database {

    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun insert(string: String) {
        data.add(string)
    }
}