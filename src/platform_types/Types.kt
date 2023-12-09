package platform_types

import java.lang.IllegalArgumentException

//Any
// working with unknown types
fun printLength(any: Any) {
    if (any is String) {
        println("Lenghth: ${any.length}")
    } else {
        println("Type is unknown")
    }
}





//Unit
fun foo(): Unit {}

interface Processor<T> {
    fun process(): T
}

class ResultProcessor : Processor<String> {
    override fun process(): String {
        return "some result"
    }
}

class NoResultProcessor : Processor<Unit> {
    override fun process() {
        // do some logic
    }
}





//Nothing - bottom-type
// Описывает результат «функции, которая никогда ничего не вернёт»
fun boo(): Nothing {
    throw Exception()
}

fun boo2(): Nothing {
    while (true) {
        // do smth
    }
}

fun doLater() {
    TODO()
}

val x = -10
val checkedX : Int = if (x < 0) {
    throw IllegalArgumentException()
} else {
    x
}

