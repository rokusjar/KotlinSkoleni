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
    companion object : Provider<UserRepository>() {
        override fun create() = UserRepositoryImpl()
    }
}

class UserRepositoryImpl : UserRepository {
    init {
        println("Instantiating ${this.javaClass.canonicalName}")
    }

    override val user = User("Karel")
}

fun main(args: Array<String>) {
    // TODO (1.1) vyzkoušej factory metodu
    println("Data from repository: ${UserRepository.get().user}")

    // TODO (2) přidej mockovou implementaci UserRepository a vyzkoušej zda funguje
    UserRepository.mocked = object : UserRepository {
        override val user = User("Franta")
    }
    println("Data from mocked repository: ${UserRepository.get().user}")

    // TODO (3) rozšiř UserRepository o novou factory metodu getLazy() (nesmíš ale UserRepository měnit, představ si, že je vnějaké knihovně 3tí strany)
    // Nápověda: použij pro implementaci funkci lazy {}
    fun UserRepository.Companion.getLazy() = lazy { UserRepository.get() }
    val lazyRepo = UserRepository.getLazy()
    println("Lazy repo is: ${lazyRepo.isInitialized()}")
    println("Data from lazy repository: ${lazyRepo.value.user}")
}