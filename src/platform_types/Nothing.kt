package platform_types

import java.lang.IllegalArgumentException

fun fail() {
    throw IllegalArgumentException()
}

fun failNothing(): Nothing {
    throw IllegalArgumentException()
}

data class Person(val name: String)

fun main() {
    val p: Person? = null
    val person = p ?: fail()
    val nothingPerson = p ?: failNothing()

//    person.name // Any
    nothingPerson.name // Person
}
