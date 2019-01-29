package advanced.collections

fun main() {
    // TODO (1.1) vytvoř imutabilní mapu bankovních kódů (stačí 3 prvky), vypiš kanonické jméno třídy a obsah mapy
    val bankCodesMap = mapOf("CSOB" to "0300", "KB" to "0100", "CS" to "0800")
    println("Bank codes: [${bankCodesMap.javaClass.canonicalName}:$bankCodesMap]")

    // TODO (1.1) vypiš z mapy hodnotu klíče, který je v mapě obsažen a také hodnotu klíče, který v mapě není
    println("'CS':${bankCodesMap["CS"]}")
    println("'mBank':${bankCodesMap["mBank"]}")

    // TODO (2) vytvoř tříděnou mapu bankovních kódů a zkus do ní přidat prvek
    // K zamyšlení:
    //  Proč to jde? Jak vytvořit imutabilní tříděnou mapu?
    //  Experimetuj s dalšími factory metodami hashMapOf, linkedMapOf
    val mutableBankCodesMap= sortedMapOf("CSOB" to "0300", "KB" to "0100", "CS" to "0800")
    mutableBankCodesMap += ("RB" to "5500")
    println("Bank codes: [${mutableBankCodesMap.javaClass.canonicalName}:$mutableBankCodesMap]")

    // TODO (3) vypiš zvlášť klíče a hodnoty mapy
    println("${bankCodesMap.keys}:${bankCodesMap.values}")

    // TODO (4) prozkoumej možnosti iterace přes mapu
    // Proč je možné přes mapu iterovat i když nedědí od Iterable?
    for(banCode in bankCodesMap) {
        println("Map entry: $banCode")
    }

    // TODO (5) vytvoř z předchozí mapy mapu, kde klíče budou hash kódy předchozích klíčů
    println("Map with hash code keys: ${bankCodesMap.mapKeys { it.hashCode() }}")
}