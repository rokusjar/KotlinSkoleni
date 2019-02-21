package advanced.collections

data class Account(val accountNo: String, val balance: Double = 0.0, var accountType: AccountType? = null)
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

    // TODO (2) vypiš do konzole číslo posledního běžného účtu (CURRENT)

    // TODO (3) najděte první účet, který má zůstatek větší než 1 milión, pokud se nenajde nemělo by dojít k výjimce

    // TODO (4) zjistěte zda kolekce accountList obsahuje nějaký účet se záporným zůstatkem

    // TODO (5) ověřte, že všechny účty splňují limit maximálního přečerpání 20tis

    // TODO (6) vypište počet běžných účtů v kolekci

    // TODO (7) vypiš všechna čísla účtů

    // TODO (8) vypiš všechny cifry obsažené v číslech účtů, cifry se nesmí opakovat a budou seřazené dle velikosti

    // TODO (9) rozděl seznam účtů na seznam účtů bez určení typu a seznam účtů, kde je typ určen

    // TODO (10) vytvoř seznam dvojic (Pair) kde první hodnota bude index účtu v seznamu a druhá bude příslušný účet

    // TODO (11) roztřiď účty podle typu

    // TODO (12) vytvoř mapu, kde klíčem bude typ účtu a hodnota bude poslední nalezený účet daného typu

    // TODO (13) vypiš sumu všech zůstatků

    // TODO (14) vypiš průměrný zůstatek ze všech účtů

    // TODO (15) spoj seznamy souřadnic x a y do jednoho seznamu dvojic (x, y)
    // Co se stane když seznamy nebudou mít shodnou délku?
    val xCoordinates = listOf(3,56,18,33)
    val yCoordinates = listOf(34,6,39,10)
}