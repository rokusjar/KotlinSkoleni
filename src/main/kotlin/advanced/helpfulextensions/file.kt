package advanced.helpfulextensions

import java.io.File
import java.nio.charset.Charset
import java.time.LocalDate

data class Transaction(val date: LocalDate, val accountNumber: String, val partyAccount: String, val amount: Double)

fun Transaction.toCsv(): String = "$date;$accountNumber;$partyAccount;$amount"

val transactions = listOf(
        Transaction(LocalDate.of(2018, 1, 1), "123456", "98754662", 231.9),
        Transaction(LocalDate.of(2018, 11, 3), "6546664", "8974216", 25631.0),
        Transaction(LocalDate.of(2017, 5, 30), "985414346", "413246", 231.9))

fun main() {
    // TODO (1) zapiš seznam transakcí do souboru jako CSV (pro účely příklady bez použití externích knihoven)
    File("data.csv")
            .printWriter(Charset.forName("Windows-1250"))
            .use { out ->
                out.println("datum;číslo účtu;číslo účtu protistrany;částka")
                transactions.forEach { out.println(it.toCsv()) }
            }

    // TODO (2) načti CSV soubor zapsaný v předchozím příkladě do seznamu transakcí (můžeš předpokládat nezměněnou strukturu souboru),
    // vypiš načtené transakce do konzole
    File("data.csv")
            .readLines()
            .drop(1)
            .map {
                with(it.split(";")) {
                    Transaction(LocalDate.parse(component1()), component2(), component3(), component4().toDouble())
                }
            }
            .forEach(::println)
}