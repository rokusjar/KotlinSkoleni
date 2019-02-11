package advanced.helpfulextensions

const val MAX_NUM_OF_LINES = 3
const val MAX_LENGTH_OF_LINE = 10

// TODO (1) vytvoř validátor, který zkontroluje daný řetězec a v rátí uživateli textovou informaci o jeho validitě:
//  - pokud se jedná o prázdný řetězec ozná mí to
//  - pokud má text více než 3 řádky a nebo některý řádek je delší než 10 znaků, oznámí to uživateli spolu s informací, jak to napravit (kde je chyba)
//  - pokud je zpráva validní, vrátí potvrzení, že je zpráva OK
fun String?.validate(): String {
    if (this == null) return "Nothing on input!"

    fun validateSize(): String {
        val lines = lines()
        val longLinesNumbers = lines.mapIndexed { index, s -> Pair(index + 1, s.length) }.filter { it.second > MAX_LENGTH_OF_LINE }.map { it.first }

        return when (true) {
            lines.size > MAX_NUM_OF_LINES -> "Input contains ${lines.size} lines. Allowed maximum is $MAX_NUM_OF_LINES lines."
            longLinesNumbers.isNotEmpty() -> "Following lines are longer than allowed maximum $MAX_LENGTH_OF_LINE: $longLinesNumbers"
            else -> "Input si valid."
        }
    }

    return when (true) {
        isEmpty() -> "Empty input!"
        isBlank() -> "Blank input!"
        else -> validateSize()
    }
}

fun main() {
    // TODO (1.1) otestuj validátor (pro teststování víceřádkového textu použij multiline strings)
    val nullString: String? = null
    println(nullString.validate())
    println("".validate())
    println(" ".validate())
    println("""Multi
            |line
            |test,
            |with too many lines.""".trimMargin().validate())
    println("""Multi
            |line validation
            |test, with very long lines.""".trimMargin().validate())
    println("""Finally,
            |valid.""".trimMargin().validate())
}