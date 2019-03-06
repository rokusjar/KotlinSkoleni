package advanced.helpfulextensions

import java.io.File
import java.nio.charset.Charset
import java.time.LocalDate
import kotlin.system.measureTimeMillis

data class Transaction(val date: LocalDate, val accountNumber: String, val partyAccount: String, val amount: Double) {
    companion object
}

fun Transaction.toCsv(): String = "$date;$accountNumber;$partyAccount;$amount"

val transactions = listOf(
        Transaction(LocalDate.of(2018, 1, 1), "123456", "98754662", 231.9),
        Transaction(LocalDate.of(2018, 11, 3), "6546664", "8974216", 25631.0),
        Transaction(LocalDate.of(2017, 5, 30), "985414346", "413246", 231.9))

fun main() {
    // TODO (1) zapiš seznam transakcí do souboru jako CSV (pro účely příklady bez použití externích knihoven),
    // vytvoř pro tento soubor v pracovním adresáři samostatný adreasář jménem csv
    val dataFile = File("csv/data.csv").also { it.parentFile.mkdirs() }
    dataFile.printWriter(Charset.forName("Windows-1250"))
            .use { out ->
                out.println("datum;číslo účtu;číslo účtu protistrany;částka")
                transactions.forEach { out.println(it.toCsv()) }
            }

    // TODO (2) vytvoř kopii vytvořeného souboru, do stejného adresáře
    File("csv/dataCopy.csv").delete()
    val dataFileCopy = dataFile.copyTo(File("csv/dataCopy.csv"))

    // TODO (3) načti CSV soubor zapsaný v předchozím příkladě do seznamu transakcí (můžeš předpokládat nezměněnou strukturu souboru),
    // vypiš načtené transakce do konzole
    dataFileCopy.readLines()
            .drop(1)
            .map {
                with(it.split(";")) {
                    Transaction(LocalDate.parse(this[0]), this[1], this[2], this[3].toDouble())
                }
            }
            .forEach(::println)

    println("Version 2 ...")
    // verze 2
    fun Transaction.Companion.fromLine(line: String) = line.split(';').let {
        Transaction(date = LocalDate.parse(it[0]), accountNumber = it[1], partyAccount = it[2], amount = it[3].toDouble())
    }
    File("csv/dataCopy.csv")
            .useLines { lines -> lines.drop(1).map { Transaction.fromLine(it) }.forEach(::println) }


    // TODO (4) smaž adresář csv
    File("csv").deleteRecursively()

    // TODO (5) vypiš do konzole obsah aktuálního adresáře a rekurzivně všech podadresářů, změř jak dlouho v ms operace trvala
    measureTimeMillis {
        File(".")
                .walkTopDown()
                .forEach { println(it) }
    }.also { println("Operace trvala $it ms.") }
}
