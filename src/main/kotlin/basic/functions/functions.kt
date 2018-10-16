package basic.functions

fun main(args: Array<String>) {

    fun printMyName(firstName: String, lastName: String = "Doe") = println("Jmenuji se $firstName $lastName")

    printMyName(lastName = "Lucas", firstName = "George")

    fun callOnString(string: String, function: String.() -> String): String = string.function()

    println(callOnString("Harrison Ford", String::reversed))

    println(callOnString("Harrison Ford") {
        this.replace("Harrison", "Han")
                .replace("Ford", "Solo")

    })

    fun String.println() = println(this)
    "Star Wars".println()

    infix fun String.splitBy(char: Char): List<String> = this.split(char)
    println("May the force be with you!" splitBy ' ')
}
