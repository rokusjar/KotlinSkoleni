package advanced.collections

fun main() {
    // TODO (1.1) vytvoř seznam celých čísel, vytiskni kanonické jméno třídy
    // TODO (1.2) experimentuj s různými způsoby vytvoření seznamu, imutable i mutable

    // TODO (1.3) změň některou hodnotu některého výše vytvořeného mutable seznamu (použij indexed access)
    // Ověř, že pro imutable seznam to nejde. Co se stane když použiješ neexistující index?

    // TODO (2.1) přidej prvek od kolekce kacked (nápověda, použij přetypování)
    // zkus to samé na výše vytvořený seznam intList, co se stane?
    val hacked = listOfNotNull(0, 1)

    // TODO (2.2) vytvoř hackerskou metodu v Javě, která má za parametr Collection a jako side effect přidá prvek do kolekce hacked
    // zkus metodu zavolat na výše vytvořený seznam intList, co se stane?

    // TODO (3.1) vyzkoušej operátory + nebo - na imutabilní seznam, podívej se na implementaci operátoru

    // TODO (3.2) vyzkoušej operátory += nebo -= na mutabilní seznam, podívej se na implementaci operátoru

    // TODO (4) vyber náhodný prvek z předchozího seznamu a vytiskni ho

    // TODO (5) Bonusová úloha: napiš kód na generování 16 místného klíče - povolené ascii znaky 0 (nula) až malé 'z'.
}