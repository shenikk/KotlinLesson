package refactoring

// example from Effective Kotlin

data class Person(
    val isAdult: Boolean = true
)

fun doSomeLogic(person: Person?) {
    person?.takeIf { it.isAdult }
        ?.let {
            // show person
        } ?: {
        // show error
    }
}