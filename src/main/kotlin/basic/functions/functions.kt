package basic.functions

fun main(args: Array<String>) {

    // TODO (1) Doplntě nějakou výchozí hodnotu pro příjmení
    fun printMyName(firstName: String, lastName: String = "Doe") = println("Jmenuji se $firstName $lastName")

    // TODO (2) Zkuste zavolat funkci printMyName s pojmenováním parametrů, zkuste prohodit hodnoty
    printMyName(lastName = "Lucas", firstName = "George")

    // TODO (3) Předělejte funkci tak, aby příjímala jinou funkci jako druhý parametr, zavolala ji na parametr string a vrátila výsledek této operace
    fun callOnString(string: String, function: String.() -> String): String = string.function()

    // TODO (4) Zkuste zavolat upravenou funkci callOnString,  funkci si vymyslete, nebo použijte nějakou existující
    println(callOnString("Harrison Ford", String::reversed))

    println(callOnString("Harrison Ford") {
        this.replace("Harrison", "Han")
                .replace("Ford", "Solo")

    })

    // TODO (5) Vytvořte rozšiřující funkci pro třídu String, která vypíše string na který je zavolána (receiver) do konzole.
    fun String.println() = println(this)
    "Star Wars".println()

    // TODO (6) Vytvořte "infix function" splitBy která se bude volat na String a bude přijímat Char, podle kterého bude String dělit
    infix fun String.splitBy(char: Char): List<String> = this.split(char)
    println("May the force be with you!" splitBy ' ')
}
