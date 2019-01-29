package advanced.collections

data class Account(val accountNo: String, val balance: Double, var accountType: AccountType? = null)
enum class AccountType { CURRENT, OVERDRAFT }

val accountList = listOf(
        Account("12345", 55134.0, AccountType.CURRENT),
        Account("8387532", 55134.0),
        Account("234567", -15134.0, AccountType.OVERDRAFT),
        Account("0122384", 5.0, AccountType.CURRENT),
        Account("18283002", 5.0)
)

fun main() {
    // TODO (1) vypiš do konzole běžné účty (CURRENT). Všiměte si výhody použití data class při výpisu.
    println("Current accounts: ${accountList.filter { it.accountType == AccountType.CURRENT }}")

    // TODO (2) vypiš do konzole číslo posledního běžného účtu (CURRENT)
    println("Last current account: ${accountList.last { it.accountType == AccountType.CURRENT }.accountNo}")

    // TODO (3) najděte první účet, který má zůstatek větší než 1 milión, pokud se nenajde nemělo by dojít k výjimce
    println("First account with balance over one milion: ${accountList.firstOrNull { it.balance > 1000000 }}")

    // TODO (4) zjistěte zda kolekce accountList obsahuje nějaký účet se záporným zůstatkem
    println("Any account with negative balance? ${accountList.none { it.balance < 0 }}")

    // TODO (5) ověřte, že všechny účty splňují limit maximálního přečerpání 20tis
    println("All accounts within overdraft limit? ${accountList.all { it.balance >= -20000 }}")

    // TODO (6) vypište počet běžných účtů v kolekci
    println("Number of current accounts: ${accountList.count { it.accountType == AccountType.CURRENT }}")

    // TODO (7) vypiš všechna čísla účtů
    println("All account numbers: ${accountList.map { it.accountNo }.joinToString(", ")}")

    // TODO (8) vypiš všechny cifry obsažené v číslech účtů, cifry se nesmí opakovat a budou seřazené dle velikosti
    println("All digits from account numbers: ${accountList.flatMap { it.accountNo.toList() }.distinct().sorted()}")

    // TODO (9) rozděl seznam účtů na seznam účtů bez určení typu a seznam účtů, kde je typ určen
    val (accountsWithoutType, accountsWithType) = accountList.partition { it.accountType == null }
    println("Accounts without type: $accountsWithoutType")
    println("Accounts with type: $accountsWithType")

    // TODO (10) vytvoř seznam dvojic (Pair) kde první hodnota bude pořadové číslo účtu v seznamu a hodnota bude příslušný účet
    // Co se stane když seznamy nebudou mít shodnou délku?
    println("Pairs index and account: ${1..accountList.size zip accountList}")

    // TODO (11) roztřiď účty podle typu
    println("Accounts by account type: ${accountList.groupBy { it.accountType }}")

    // TODO (12) vytvoř mapu, kde klíčem bude typ účtu a hodnota bude poslední nalezený účet daného typu
    println("Accounts associated by account type: ${accountList.associateBy { it.accountType }}")

    // TODO (13) vypiš sumu všech zůstatků
    println("Sum of balances: ${accountList.sumByDouble { it.balance }}")

    // TODO (14) vypiš průměrný zůstatek ze všech účtů
    println("Average balance: ${accountList.map { it.balance }.average()}")
}