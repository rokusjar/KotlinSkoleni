package basic.patterns

abstract class Provider<T> {
    var original: T? = null
    var mocked: T? = null

    abstract fun create(): T
    fun get(): T = mocked ?: original ?: create().apply { original = this }
}

data class User(val name: String)

interface UserRepository {
    val user: User

    // TODO (1) implementuj companion object, který zpřístupní metodu get() abstraktního Provideru jako SFM
}

class UserRepositoryImpl : UserRepository {
    init {
        println("Instantiating ${this.javaClass.canonicalName}")
    }

    override val user = User("Karel")
}

fun main(args: Array<String>) {
    // TODO (1.1) vyzkoušej factory metodu

    // TODO (2) přidej mockovou implementaci UserRepository a vyzkoušej zda funguje

    // TODO (3) rozšiř UserRepository o novou factory metodu getLazy() (nesmíš ale UserRepository měnit, představ si, že je vnějaké knihovně 3tí strany)
    // Nápověda: použij pro implementaci funkci lazy {}
}