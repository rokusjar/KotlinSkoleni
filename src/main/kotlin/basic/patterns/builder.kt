package basic.patterns

// TODO (2) naimplementujte to samé v Kotlinu a vytvořte nový typ účtu BankAccountKt
data class BankAccountKt(val accountNumber: String,
                         val owner: String? = null,
                         val balance: Double = 0.0,
                         val interestRate: Double = 0.0)


fun main() {
    // TODO (1) vytvořte pomocí javovského BankAccount builderu instanci účtu a vypište do konzole
    // Poznámka: všiměte si přesně jaký typ vám builder vrátí.
    // Co musíte ještě udělat, abyste dostali rozumný výstup
    val account = BankAccount.Builder("13212")
            .withOwner("Karel Novák")
            .openingBalance(2000.0)
            .build()
    println("New java account: $account")

    // TODO (2.1) vytvořte instanci účtu BankAccountKt a vypište do konzole
    // Porovnejte výstupy. Porovnejte náročnost implementace.
    val bankAccountKt = BankAccountKt(accountNumber = "13212", owner = "Karel Novák", balance = 2000.0)
    println("New kotlin account: $bankAccountKt")

    // TODO (3) vytvořte funkci AccountDsl (fake constructor) - vyzkoušejte DLS přístup a přepoužijte Java builder,
    // pomocí nové funkce vytvořte nový účet a vypište do konzole,
    // porovnejte styl zápisu oproti TODO (1).
    // Bonusová otázka: jak by musel být implementován Java builder, abychom mohli nastavovat jednotlivé atributy jako property (např. owner = "Karel Novák")?
    // Odpověď: musel by mít naimplemetovaný pro každý atribut setter, ale i getter! Kotlin nepodporuje v tuto chvíli set-only property.
    fun AccountDsl(accountNumber: String, init: BankAccount.Builder.() -> Unit): BankAccount {
        return BankAccount.Builder(accountNumber).apply(init).build()
    }
    val freshMadeAccount = AccountDsl("13212") {
        withOwner("Karel Novák")
        openingBalance(2000.0)
    }
    println("Fresh made account: $freshMadeAccount")
}