package refactoring

// example from Effective Kotlin

data class User(val name: String)

class UserRepository {
    val storedUsers: MutableMap<Int, String> = mutableMapOf()

    fun loadAll(): MutableMap<Int, String> {
        return storedUsers
    }
}