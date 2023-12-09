import java.util.ArrayList

val name: String? = "Max"
val surname: String = "Braun"

val fullName: String?
    get() = name?.let { "$it $surname" }

val fullName2: String? = name?.let { "$it $surname" }

//fun main() {
//    if (fullName != null) {
//        println(fullName.length)
//    }
//
//    if (fullName2 != null) {
//        println(fullName2.length)
//    }
//}

fun main() {
    val list = listOf(1, 2, 3)
    val list2 = mutableListOf(1, 2, 3)
//    val list = arrayListOf(1, 2, 3)


    println(list.javaClass)
    println(list2.javaClass)


    if (list is MutableList) {
        list.add(4)
    }
}