package advanced.collections

fun main() {
    // TODO (1.1) vytvoř seznam celých čísel, vytiskni kanonické jméno třídy
    // TODO (1.2) experimentuj s různými způsoby vytvoření seznamu, imutable i mutable
    val intList = listOf(1, 2, 3)
    println("Int list[${intList.javaClass.canonicalName}]:$intList")

    val randomList = List(3) { (1..3).random() }
    println("Int list[${randomList.javaClass.canonicalName}]:$randomList}")

    val arrayList = ArrayList<Int>()
    println("Int list[${arrayList.javaClass.canonicalName}]:$arrayList")

    val arrayList2 = arrayListOf(1, 2)
    println("Int list[${arrayList2.javaClass.canonicalName}]:$arrayList2")

    val mutableList = mutableListOf(1, 2, 3)
    println("Int list[${mutableList.javaClass.canonicalName}]:$mutableList")

    // TODO (1.3) změň některou hodnotu některého výše vytvořeného mutable seznamu (použij indexed access)
    // Ověř, že pro imutable seznam to nejde. Co se stane když použiješ neexistující index?
    mutableList[0] = 5
    println("Int list[${mutableList.javaClass.canonicalName}]:$mutableList")

    // TODO (2.1) přidej prvek od kolekce kacked (nápověda, použij přetypování)
    // zkus to samé na výše vytvořený seznam intList, co se stane?
    val hacked = listOfNotNull(0, 1)
    (hacked as java.util.ArrayList<Int>).add(10)
    println("Hacked list[${hacked.javaClass.canonicalName}]:$hacked")

    // TODO (2.2) vytvoř hackerskou metodu v Javě, která má za parametr Collection a jako side effect přidá prvek do kolekce hacked
    // zkus metodu zavolat na výše vytvořený seznam intList, co se stane?
    Hack.hack(hacked)
    println("Hacked list[${hacked.javaClass.canonicalName}]:$hacked")

    // TODO (3.1) vyzkoušej operátory + nebo - na imutabilní seznam, podívej se na implementaci operátoru
    val intListPlus = intList + 5
    println("Int list plus: $intListPlus")

    // TODO (3.2) vyzkoušej operátory += nebo -= na mutabilní seznam, podívej se na implementaci operátoru
    mutableList += 5
    println("Mutable Int list plus: $mutableList")

    // TODO (4) vyber náhodný prvek z předchozího seznamu a vytiskni ho
    println("Random value: ${mutableList[mutableList.indices.random()]}")

    // TODO (5) Bonusová úloha: napiš kód na generování 16 místného klíče - povolené ascii znaky 0 (nula) až malé 'z'.
    println("Key: ${(1..16).map { ('0'..'z').random() }.joinToString(separator = "")}")
}