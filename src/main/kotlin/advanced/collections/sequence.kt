package advanced.collections

import java.util.concurrent.TimeUnit
import kotlin.system.measureTimeMillis

fun heavyCalculation(number: Int): Int {
    TimeUnit.SECONDS.sleep(1)
    return number * number
}

fun main() {

    // TODO (1.1) pomocí funkce heavyCalculation vytvoř z kolekce čísel od 1 do 10 kolekci jejich mocnin a vypiš první dva prvky nové kolekce
    // TODO (1.2) změř dobu běhu programu (nápověda: můžeš použít globální funkci measureTimeMillis)
    // TODO (1.3) proveď stejné operace nad sekvencí čísel od 1 do 10 a porovnej dobu běhu

    // TODO (2) vytvoř generátor fibonnacciho posloupnosti (1,1,2,3,5 - hodnota následujícího prvku je součtem dvou předchozích),
    //  vytiskni prvních 12 prvků této sekvence
}