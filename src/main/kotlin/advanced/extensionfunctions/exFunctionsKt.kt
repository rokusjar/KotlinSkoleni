package advanced.extensionfunctions

import advanced.extensionfunctions.base.Employee
import advanced.extensionfunctions.base.Person
import java.time.LocalDateTime

private fun initPerson() {
    // TODO (1) Podívejte se na metodu initPerson ve třídě ExFunctionsJava.
    // TODO     Vytvořte stejnou funkci v Kotlinu a zkuste použít rozšiřující funkce.

    with(Person()) {
        this.firstName = "John"
        this.lastName = "Doe"
        this.age = 24
        this.born = LocalDateTime.now().minusYears(24)
        this.address = "Radlická 714/113 Praha 5"
    }
}

private fun fillFirstNameIfMissing(person: Person, name: String) {
    // TODO (2) Podívejte se na metodu fillFirstNameIfMissing ve třídě ExFunctionsJava.
    // TODO     Vytvořte stejnou funkci v Kotlinu, zkuste použít rozšiřující funkce.

    person.apply { firstName = firstName.takeUnless { it.isNullOrBlank() } ?: "Unknown" }
}

private fun createEmployee(person: Person, position: String): Employee {
    // TODO (3) Podívejte se na metodu createEmployee ve třídě ExFunctionsJava.
    // TODO     Vytvořte stejnou funkci v Kotlinu a zkuste použít rozšiřující funkce.

    return Employee().apply {
        fullName = "${person.firstName} ${person.lastName}"
        age = person.age
        this.position = position
    }
}

private fun printAddressIfNotNull(person: Person) {
    // TODO (4)     Podívejte se na metodu printAddressIfNotNull ve třídě ExFunctionsJava.
    // TODO         Vytvořte stejnou funkci v Kotlinu a zkuste jí zjednodušit pomocí rozšiřující funkce
    // Nápověda:    Vzpomeňte si na operátor ?.

    person.address?.let { println(it) }
}

fun main(args: Array<String>) {

}
