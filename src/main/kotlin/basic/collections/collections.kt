package basic.collections

fun main(args: Array<String>) {

    var mutableColors = mutableListOf("red", "green", "blue")

    // TODO (1) Vytvořte read-only(immutable) pohled na kolekci mutableColors
    val immutableView: List<String> = mutableColors

    // TODO (2) Do kolekce mutable Colors přidejte další barvu
    mutableColors.add("purple")

    // TODO (3) Vypište do konzole obsah pohledu, ale odfiltrujte červenou
    println(immutableView.filter { it != "red" })
}
