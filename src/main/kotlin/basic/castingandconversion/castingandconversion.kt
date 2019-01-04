package basic.castingandconversion

fun main(args: Array<String>) {

    val a: Any = "aaa"

    // TODO (1) Odkomentujte a obalte volání funkce println podmínkou, která vyřeší "Unresolved reference"
    if (a is String) {
        println(a.isEmpty())
    }

    /*
    TODO (2) Ověřte jestli a je typu String. Pokud ano rovnou uložte hodnotu a do proměnné b,
    TODO     pokud ne, převeďte a na String a pak uložtej její hodnotu do b.
    */
    // Nápověda: Použijte when
    val b: String = when (a) {
        is String -> a
        else -> a.toString()
    }

}
