package platform_types

fun platformType() {
    val value = JavaClass().value
    println(value.length) //NPE
}

fun statedType() {
    val value: String = JavaClass().value //NPE
    println(value.length)
}

fun main() {
    platformType()
    statedType()
}

