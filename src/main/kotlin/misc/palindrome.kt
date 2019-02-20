package misc

fun main() {

    // TODO implementuj String extension funkci na palindrome
    // Palindrom (z řec. palindromos, běžící pozpátku) je slovo, číslo, věta, která má tu vlastnost, že ji lze číst v libovolném směru (zprava doleva nebo zleva doprava) a má vždy stejný význam.

    fun String.isPalindrome(): Boolean = TODO()

    println("".isPalindrome()) // true
    println("1".isPalindrome()) // true
    println("12".isPalindrome()) // false
    println("11".isPalindrome()) // false
    println("jelenovipivonelej".isPalindrome()) // true

}