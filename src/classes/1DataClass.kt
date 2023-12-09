package classes

// https://kotlinlang.ru/docs/data-classes.html

data class Player(val name: String, val score: Int)

data class Person(val name: String) {
    var age: Int = 0
}

fun main() {
    val p1 = Person("Петя").also {
        it.age = 12
    }
    val p2 = Person("Петя").also {
        it.age = 18
    }

    println(p1 == p2)
}