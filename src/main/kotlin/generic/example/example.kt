package generic.example

fun main() {
    val list: MyList<Int> = MyArrayList()
    for (i in 0..100) {
        list.add(i)
    }
    for (i in 10..90) {
        list.removeAt(10)
    }
    for (i in 0 until list.size()) {
        println(list.get(i))
    }
}