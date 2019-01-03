package basic.functions

fun main(args: Array<String>) {

    // TODO (1) Doplntě nějakou výchozí hodnotu pro příjmení
    fun printMyName(firstName: String, lastName: String) = println("Jmenuji se $firstName $lastName")

    // TODO (2) Zkuste zavolat funkci printMyName s pojmenováním parametrů, zkuste prohodit hodnoty

    // TODO (3) Předělejte funkci tak aby příjmala funkci jako další parametr, zavolala ji na parametr string a vrátila výsledek této operace
    fun callOnString(string: String) {}

    // TODO (4) Zkuste zavolat upravenou funkci callOnString,  funkci si vymyslete, nebo použijte nějakou existující

    // TODO (5) Vytvořte rozšiřující funkci pro třídu String, která vypíše string na který se zavolá do konzole.

    // TODO (6) Vytvořte "infix function" splitBy která se bude volat na String a bude přijímat Char, podle kterého bude String dělit

}
