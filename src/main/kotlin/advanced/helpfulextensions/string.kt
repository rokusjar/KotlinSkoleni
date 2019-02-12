package advanced.helpfulextensions

import kotlin.random.Random

// TODO (2) napiš funkci generateForBlank která, přijímá na vstupu parametr typu string a pro:
// - prázdný řetězec vygeneruje náhodný a vrátí ho
// - neprázdný řetězec vrátí původní řetězec, ktrerý dostal na vstupu
fun generateForBlank(input: String) = input.ifBlank { (1..6).map { Random.nextInt('a'.toInt(), 'z'.toInt()).toChar() }.joinToString("") }

// TODO (3) napiš funkci, která pro daný víceřádkový řetězec vrátí pro každý řádek jeho pořadové číslo v řetězci a jeho velikost ve znacích
// Funkce by měla fungovat i na null - tj. pro String?
fun String?.lineSizes(): List<Pair<Int, Int>> = orEmpty().lines().mapIndexed { index, string -> Pair(index + 1, string.length) }

fun main() {
    // TODO (1) doplň čísla účtů z leva nulami do celkové délky 10ti znaků
    val accountNumbers = listOf("123", "4930", "987654")
    println(accountNumbers.map { it.padStart(10, '0') })

    // TODO (2.1) vyzkoušej funkci generateForBlank
    println(generateForBlank("Honza"))
    println(generateForBlank("  "))

    // TODO (3.1) otestuj funkci pro zjištění velikosti řádků (pro otestování použij multiline string)
    (null as String?).lineSizes()
    println("""Multi
            |line
            |test,
            |with few lines.""".trimMargin().lineSizes())
}