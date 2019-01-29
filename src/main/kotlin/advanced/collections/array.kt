package advanced.collections

fun main() {
    // TODO (1) experimentuj s různými způsoby vytvoření pole
    val integerArray = arrayOf(1, 2, 3)
    println("Array ${integerArray.javaClass.canonicalName} : [${integerArray.joinToString(",")}]")

    val intArray = intArrayOf(1, 2, 3, 4, 5, 1)
    println("Array ${intArray.javaClass.canonicalName} : [${intArray.joinToString(",")}]")

    // TODO (1.1) použij Array konstruktor s inicializační lambda funkcí a vytvoř pole účtů (Account z list.kt)
    // Nápověda: nezapomeň, že existuje when
    val accounts = Array(2) { index ->
        when (index) {
            0 -> Account("9823")
            1 -> Account("5243131")
            else -> throw IllegalArgumentException("Too many")
        }
    }
    println("Accounts: ${accounts.javaClass.canonicalName} : [${accounts.joinToString(",")}]")

    // TODO (2) získej výsek pole na indexech 1 až 3
    // Proč je canonicalName null?
    // Experimentuj s dalšími extension funkcemi
    val slicedArray = intArray.slice(1..3)
    println("Sliced array: ${slicedArray.javaClass.canonicalName} : ${slicedArray.javaClass.name} : $slicedArray")
}