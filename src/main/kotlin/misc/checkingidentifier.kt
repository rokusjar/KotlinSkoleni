package misc

// Checking identifier
fun main() {

    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

// TODO Implement the function that checks whether a string is a valid identifier.
// A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters, digits and underscores.

fun isValidIdentifier(id: String): Boolean {
    fun isValidCharacter(ch: Char) = ch == '_' || ch in '0'..'9' || ch in 'a'..'z' || ch in 'A'..'Z'

    if (id.isEmpty() || id[0] in '0'..'9') return false
    for (ch in id) {
        if (!isValidCharacter(ch)) return false
    }
    return true
}

fun isValidIdentifier2(id: String): Boolean {
    fun isValidCharacter(ch: Char) = ch == '_' || ch.isLetterOrDigit()

    if (id.isEmpty() || id[0].isDigit()) return false
    for (ch in id) {
        if (!isValidCharacter(ch)) return false
    }
    return true
}

