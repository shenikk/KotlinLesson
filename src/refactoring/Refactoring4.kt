package refactoring

// example from Effective Kotlin

fun doLogic() {
    var user: User
    val users = listOf<User>()

    for (i in users.indices) {
        user = users[i]
        println("User at $i is $user")
    }
}
