fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.replaceAll { it * 2 }
    println(list)
    //Alternatively using map and reassigning:
    val newList = list.map { it * 2 }
    println(newList)
}