package advanced.helpfulextensions

import java.io.File
import java.nio.charset.Charset
import java.time.LocalDate
import kotlin.system.measureTimeMillis

data class Transaction(val date: LocalDate, val accountNumber: String, val partyAccount: String, val amount: Double)

fun Transaction.toCsv(): String = "$date;$accountNumber;$partyAccount;$amount"

val transactions = listOf(
        Transaction(LocalDate.of(2018, 1, 1), "123456", "98754662", 231.9),
        Transaction(LocalDate.of(2018, 11, 3), "6546664", "8974216", 25631.0),
        Transaction(LocalDate.of(2017, 5, 30), "985414346", "413246", 231.9))

fun main() {
    // TODO (1) zapiš seznam transakcí do souboru jako CSV (pro účely příklady bez použití externích knihoven),
    // vytvoř pro tento soubor v pracovním adresáři samostatný adreasář jménem csv

    // TODO (2) vytvoř kopii vytvořeného souboru, do stejného adresáře

    // TODO (3) načti CSV soubor zapsaný v předchozím příkladě do seznamu transakcí (můžeš předpokládat nezměněnou strukturu souboru),
    // vypiš načtené transakce do konzole

    // TODO (4) smaž adresář csv

    // TODO (5) vypiš do konzole obsah aktuálního adresáře a rekurzivně všech podadresářů, změř jak dlouho v ms operace trvala
}