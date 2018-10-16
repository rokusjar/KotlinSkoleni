package basic.nullsafety

data class Adress(val city: String, val country: String)

data class Person(val name: String, val adress: Adress?)

fun main(args: Array<String>) {

    val person = Person("John Doe", null)

    println("${person.name} lives in ${person.adress?.city}/${person.adress?.country}")

    println("${person.name} lives in ${person.adress?.city ?: "unknown"}/${person.adress?.country ?: "unknown"}")
}
