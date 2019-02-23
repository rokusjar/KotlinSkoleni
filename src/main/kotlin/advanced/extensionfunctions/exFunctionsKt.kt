package advanced.extensionfunctions

import advanced.extensionfunctions.base.Employee
import advanced.extensionfunctions.base.Person

private fun createEmployee(person: Person, position: String): Employee {
    // TODO (1) Podívejte se na metodu createEmployee ve třídě ExFunctionsJava.
    // TODO (1.1) Vytvořte stejnou funkci v Kotlinu a zkuste použít rozšiřující funkce.

    TODO()
}

private fun fillPositionIfMissing(employee: Employee, defaultPosition: String) {
    // TODO (2) Podívejte se na metodu fillPositionIfMissing ve třídě ExFunctionsJava.
    // TODO     Vytvořte stejnou funkci v Kotlinu, zkuste použít rozšiřující funkce.
}

private fun initPerson() {
    // TODO (3) Podívejte se na metodu initPerson ve třídě ExFunctionsJava.
    // TODO (3.1) Vytvořte stejnou funkci v Kotlinu a zkuste použít rozšiřující funkce.
}

// TODO (3.2) Vytvořte funkci createPerson, ktera nebude muset volat na konci blocku build()
/**
val person = createPerson {
firstName("John")
lastName("Doe")
age(24)
address("Radlická 714/113 Praha 5")
}
 */
// Nápověda: signature bude  createPerson(block: Person.Builder.()-> Person.Builder): Person


private fun printAddressIfNotNull(person: Person) {
    // TODO (4)     Podívejte se na metodu printAddressIfNotNull ve třídě ExFunctionsJava.
    // TODO         Vytvořte stejnou funkci v Kotlinu a zkuste jí zjednodušit pomocí rozšiřující funkce
    // Nápověda:    Vzpomeňte si na operátor ?.
}


// TODO (5) Vytvořte ext funkci toEmployee(position: String): Employee v Kotlinu na tride Person a použíte rozšiřující funkce.
