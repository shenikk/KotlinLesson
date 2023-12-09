package classes

object Calculator {
    fun add(n1: Int, n2: Int): Int {
        return n1 + n2
    }
}

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

fun main() {
    println(Calculator.add(2,4))
    MyClass.create()
}