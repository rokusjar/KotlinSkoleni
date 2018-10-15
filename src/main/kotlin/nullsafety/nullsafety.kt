package nullsafety

data class Adress(val city: String, val country: String)

data class Person(val name: String, val adress: Adress)

fun main(args: Array<String>) {

    // TODO (1) Vytvořte objekt třídy Person s názvem person, kde property adress má hodnotu null. (Nápověda: nebojte se upravit třídu Person)

    // TODO (2) Napište kód který vezme objekt person a vypíše do konzole město a stát a zároveň ošetřuje případ kdy je adress null

    // TODO (3) Vylepšte výpis do konzole tím, že přidáte nějakou výchozí hodnotu, která se vypíše pokud adresa není známá
}