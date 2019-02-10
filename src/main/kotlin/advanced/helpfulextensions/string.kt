package advanced.helpfulextensions

// TODO (1) vytvoř jednoduchý validátor, který zkontroluje daný řetězec a v rátí uživateli textovou informaci o jeho validitě:
//  - pokud se jedná o prázdný řetězec ozná mí to
//  - pokud má text více než 2 řádky a nebo některý řádek je delší než 10 znaků
//  - pokud je zpráva validní, vrátí potvrzení, že je zpráva OK
fun String?.validate(): String {
    return when (true) {
        isNullOrEmpty() -> "Empty string!"
        isNullOrBlank() -> "Blank string!"
        !hasCorrectSize() -> "Message is too long!"
        else -> "Message is valid."
    }
}

fun String?.hasCorrectSize(): Boolean {
    val lines = this?.lines() ?: return false
    return lines.size <= 2 && lines.all { it.length <= 10 }
}

fun main() {
    val nullString: String? = null
    println(nullString.validate())
    println("".validate())
    println(" ".validate())
    println("Sinle long line validate".validate())
    println("Multi\nline\nvalidate.".validate())
}