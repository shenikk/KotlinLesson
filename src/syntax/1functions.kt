package syntax

import java.io.BufferedReader
import java.io.FileReader

fun sum(a: Int, b: Int): Int {
    return a + b
}

// выражения
fun sum2(a: Int, b: Int) = a + b

fun maxOf(a: Int, b: Int) = if (a > b) a else b

enum class Color { RED, GREEN, BLUE }

fun getColor(color: Color) = when (color) {
    Color.RED -> println("red")
    Color.GREEN -> println("green")
    Color.BLUE -> println("blue")
    // 'else' не требуется, потому что все случаи учтены
}

// try/catch
fun test() = try {
    // do some logic
} catch (e: ArithmeticException) {
    throw IllegalStateException(e)
}

const val input = 3L
val a: Int? = try { input.toInt() } catch (e: NumberFormatException) { null }

// incorrect try/catch
fun doLogic(path: String): Int {
    val reader = BufferedReader(FileReader(path))
    try {
        return reader.lineSequence().sumOf { it.length }
    } finally {
        reader.close()
    }
}

// correct variant
fun doLogic2(path: String): Int {
    BufferedReader(FileReader(path)).use { reader ->
        return reader.lineSequence().sumOf { it.length }
    }
}