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

// TODO (4) make  getFirstWord extension function to String

// TODO (5) make it as extension property called firstWord - note separator will not be there anymore

// After Advanced - Interop

// TODO (6) call extension function from java

// TODO (7) add @JvmFile to have nicer name

