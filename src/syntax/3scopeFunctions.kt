package syntax

// https://kotlinlang.ru/docs/scope-functions.html

var num: Int? = null
val num2: Int = 2

fun main() {
    example()
}

/**
 * Uses it
 * Returns lambda result
 *
 * Useful for checking null
 */
fun doLet(): Int {
//    if (num != null) {
//        num + 1
//    }

    return num?.let {
        it + 1
    } ?: 0
}

/**
 * Uses it
 * Returns context object
 */
fun doAlso(): Int {
    return num2.also {
        it + 1
    }
}

/**
 * Uses this
 * Returns context object
 */
fun doApply() {
    val result = mutableListOf<Int>().apply {
        add(3)
        add(5)
        add(13)
    }
}

/**
 * Uses this
 * Returns lambda result
 */
fun doRun() {
    val result = mutableListOf<Int>().run {
        println("ddjdj")
        add(3)
        add(5)
        add(13)
    }
}

fun example() {
    val numberList = mutableListOf<Double>()
    numberList.also { println("Заполнение списка") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Сортировка списка") }
        .sort()
    println(numberList)
}