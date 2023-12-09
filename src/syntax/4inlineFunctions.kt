package syntax

// https://kotlinlang.ru/docs/inline-functions.html
// https://habr.com/ru/articles/775120/

fun main() {
    testInline()
    testRegular()
}

fun testInline() {
    inlineFun { "external inline code" }
}

private inline fun inlineFun(body: () -> String) {
    println("inline func code, " + body.invoke())
}

fun testRegular() {
    regularFun { "external regular code" }
}

private fun regularFun(body: () -> String) {
    println("regular func code, " + body.invoke())
}