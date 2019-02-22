package advanced.extensionfunctions

import advanced.extensionfunctions.base.Employee
import advanced.extensionfunctions.base.Person
import java.time.LocalDateTime

private fun initPerson() {
    // TODO (1) Podívejte se na metodu initPerson ve třídě ExFunctionsJava.
    // TODO     Vytvořte stejnou funkci v Kotlinu a zkuste použít rozšiřující funkce.
}

private fun fillFirstNameIfMissing(person: Person, name: String) {
    // TODO (2) Podívejte se na metodu fillFirstNameIfMissing ve třídě ExFunctionsJava.
    // TODO     Vytvořte stejnou funkci v Kotlinu, zkuste použít rozšiřující funkce.
}

private fun createEmployee(person: Person, position: String): Employee {
    // TODO (3) Podívejte se na metodu createEmployee ve třídě ExFunctionsJava.
    // TODO     Vytvořte stejnou funkci v Kotlinu a zkuste použít rozšiřující funkce.

    TODO()
}

private fun printAddressIfNotNull(person: Person) {
    // TODO (4)     Podívejte se na metodu printAddressIfNotNull ve třídě ExFunctionsJava.
    // TODO         Vytvořte stejnou funkci v Kotlinu a zkuste jí zjednodušit pomocí rozšiřující funkce
    // Nápověda:    Vzpomeňte si na operátor ?.
}


fun main(args: Array<String>) {
    // TODO (5)
    // TODO     Zkontrolujte jestli má peter vyplněné příjmení. Pokud ne, tak nějaké nastavte
    // TODO     Doplňte věk na základě známeho data narození
    // TODO     Transfromujte objekt peter na objekt třídy Employee, nastavte fullName, age a
    // TODO     vymyslete zaměstannci nějakou pozici.
    var peter = Person.Builder("Peter")
            .withDateOfBirth(LocalDateTime.now().minusYears(32))
            .build()

    // TODO (6) Vraťte  se k funkci printAddressIfNotNull.
    // TODO     Zkuste ji implementovat pomocí funkce let a poté pomocí funkce run
    // TODO     Všimněte si rozdílu.
}
