package misc

fun isValidIdentifier(id: String): Boolean = TODO()

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
