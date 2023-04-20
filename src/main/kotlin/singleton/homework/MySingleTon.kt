package singleton.homework

import singleton.example.Database

class MySingleTon private constructor() {

    val name = "myDB.db"
    val dataName = mutableListOf<String>()

    fun insertData(string: String) {
        dataName.add(string)
    }

    companion object {

        var db: MySingleTon? = null
        fun getInstance(): MySingleTon {

            db?.let { return it }

            val instance = MySingleTon()
            db = instance
            return instance
        }
    }
}