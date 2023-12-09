package syntax

//https://kotlinlang.ru/docs/extensions.html

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' даёт ссылку на список
    this[index1] = this[index2]
    this[index2] = tmp
}

// расширения могут быть объявлены для null-допустимых типов.
fun Any?.toString(): String {
    if (this == null) return "null"
    // после проверки на null, `this` автоматически приводится к не-null типу,
    // поэтому toString() обращается (ориг.: resolves) к функции-члену класса Any
    return toString()
}

// Аналогично функциям, Kotlin поддерживает расширения свойств.
val <T> List<T>.lastIndex: Int
    get() = size - 1