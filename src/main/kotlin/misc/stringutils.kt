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
}

// Main Goal: Get rid of java style to more kotlin style

// TODO (1) use Object (singleton) instead of class

// TODO (2) get rid of class/Object and do both getFirstWord top level functions

// TODO (3) use only one method - use default parameter value for 'separator'

// TODO (4) make getFirstWord extension function to String

// TODO (5) use "let" function on "indexOf" and make method body as single expression (no code block {} used)

// After Advanced - Interop Lesson

// TODO (6) make possible to call extension function on null string and return nul and that case
// tips: extent not String but String?, use "run" function

// TODO (7) make it as extension property called firstWord - note separator will not be there anymore

// TODO (8) call extension function from java
// see StringUtils.java

// TODO (9) add @JvmFile to have nicer name like "Utils"
// see StringUtils.java


