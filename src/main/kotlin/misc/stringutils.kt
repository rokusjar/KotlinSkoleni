@file:JvmName("Utils")
package misc

class StringUtils {
    fun getFirstWord(s: String, separator: String): String {
        val index = s.indexOf(separator)
        return if (index < 0) s else s.substring(0, index)
    }

    fun getFirstWord(s: String) = getFirstWord(s, " ")
}

fun main() {
    println(StringUtils().getFirstWord("Whatever you want"))
    // TODO 1
    println("1 " + StringUtils1.getFirstWord("Whatever you want"))
    // TODO 2
    println("2 " + getFirstWord2("Whatever you want"))
    // TODO 3
    println("3 " + firstWord3("Whatever you want"))
    // TODO 4
    println("4 " + "Whatever you want".firstWord4())
    // TODO 5
    println("5 " + "Whatever you want".firstWord5())
    // TODO 6
    println("6 " + "Whatever you want".firstWord6())
    // TODO 7
    println("7 " + "Whatever you want".firstWord7)
}

// Main Goal: Get rid of java style to more kotlin style

// TODO (1) use Object (singleton) instead of class
object StringUtils1 {

    fun getFirstWord(s: String, separator: String): String {
        val index = s.indexOf(separator)
        return if (index < 0) s else s.substring(0, index)
    }

    fun getFirstWord(s: String) = getFirstWord(s, " ")
}

// TODO (2) get rid of class/Object and do both getFirstWord top level functions
fun getFirstWord2(s: String, separator: String): String {
    val index = s.indexOf(separator)
    return if (index < 0) s else s.substring(0, index)
}

fun getFirstWord2(s: String) = getFirstWord2(s, " ")


// TODO (3) use only one method - use default parameter value for 'separator'
fun firstWord3(s: String, separator: String = " "): String {
    val index = s.indexOf(separator)
    return if (index < 0) s else s.substring(0, index)
}

// TODO (4) make getFirstWord extension function to String
fun String.firstWord4(separator: String = " "): String {
    val index = this.indexOf(separator)
    return if (index < 0) this else substring(0, index)
}

// TODO (5) use "let" function on "indexOf" and make method body as single expression (no code block {} used)
fun String.firstWord5(separator: String = " ") =
        indexOf(separator).let { if (it < 0) this else substring(0, it) }


// After Advanced - Interop Lesson

// TODO (6) make possible to call extension function on null string and return nul and that case
// tips: extent not String but String?, use "run" function
fun String?.firstWord6(separator: String = " ") =
        this?.run { indexOf(separator).let { if (it < 0) this else substring(0, it) } }

// TODO (7) make it as extension property called firstWord - note separator will not be there anymore
val String.firstWord7: String
    get() = indexOf(" ").let { if (it < 0) this else substring(0, it) }

// TODO (8) call extension function from java
// see StringUtils.java

// TODO (9) add @JvmFile to have nicer name like "Utils"
// see StringUtils.java

