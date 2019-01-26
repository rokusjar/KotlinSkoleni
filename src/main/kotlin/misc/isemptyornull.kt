package misc

fun main() {

    fun String?.isEmptyOrNull() = this?.isEmpty() ?: true

    val s1: String? = null
    val s2: String? = ""
    val s3 = "   "

    println(s1.isEmptyOrNull()) // true
    println(s2.isEmptyOrNull()) // true
    println(s3.isEmptyOrNull()) // false
}

// TODO Implement an extension function 'isEmptyOrNull()' on the type String?. It should return true, if the string is empty or null.