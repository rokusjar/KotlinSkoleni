package advanced.extensionfunctions

import advanced.extensionfunctions.base.Employee
import advanced.extensionfunctions.base.Person
import java.time.LocalDateTime

private fun createEmployee(person: Person, position: String): Employee {
    // TODO (1) Podívejte se na metodu createEmployee ve třídě ExFunctionsJava.
    // TODO (1.1) Vytvořte stejnou funkci v Kotlinu a zkuste použít rozšiřující funkce.

    return Employee().apply {
        fullName = "${person.firstName} ${person.lastName}"
        age = LocalDateTime.now().year - person.dateOfBirth.year
        this.position = position
    }
}

private fun fillPositionIfMissing(employee: Employee, defaultPosition: String) {
    // TODO (2) Podívejte se na metodu fillPositionIfMissing ve třídě ExFunctionsJava.
    // TODO     Vytvořte stejnou funkci v Kotlinu, zkuste použít rozšiřující funkce.

    employee.apply { position = position.takeUnless { it.isNullOrBlank() } ?: defaultPosition }
}

private fun initPerson() {
    // TODO (3) Podívejte se na metodu initPerson ve třídě ExFunctionsJava.
    // TODO (3.1) Vytvořte stejnou funkci v Kotlinu a zkuste použít rozšiřující funkce.

    // proc jsem tady použil run { } a kde se to hodí použit
    run {
        val person = Person.Builder().apply {
            firstName("John")
            lastName("Doe")
            dateOfBirth(LocalDateTime.now().minusYears(24))
            address("Radlická 714/113 Praha 5")
        }.build()
    }

    run {
        val person = Person.Builder().let {
            it.firstName("John")
            it.lastName("Doe")
            it.dateOfBirth(LocalDateTime.now().minusYears(24))
            it.address("Radlická 714/113 Praha 5")
            it.build()
        }
    }

    run {
        val person = with(Person.Builder()) {
            firstName("John")
            lastName("Doe")
            dateOfBirth(LocalDateTime.now().minusYears(24))
            address("Radlická 714/113 Praha 5")
            build()
        }
    }

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
// Nápověda: signature bude  createPerson(block: Person.Builder.()-> Unit): Person

fun createPerson(block: Person.Builder.()-> Unit) = Person.Builder().apply { block() }.build()


private fun printAddressIfNotNull(person: Person) {
    // TODO (4)     Podívejte se na metodu printAddressIfNotNull ve třídě ExFunctionsJava.
    // TODO         Vytvořte stejnou funkci v Kotlinu a zkuste jí zjednodušit pomocí rozšiřující funkce
    // Nápověda:    Vzpomeňte si na operátor ?.

    person.address?.let { println(it) }
    person.address?.run { println(this) }

    // s with to nejde než if nebo další použiti let/run
    with(person.address) {
        if (this == null) println(this)
    }
}


// TODO (5) Vytvořte ext funkci toEmployee(position: String): Employee v Kotlinu na tride Person a použíte rozšiřující funkce.

// TODO proc jsem nepouzil apply()?
fun Person.toEmployee(position: String) = Employee().let {
    it.fullName = "$firstName $lastName"
    it.age = LocalDateTime.now().year - dateOfBirth.year
    it.position = position
    it
}

val person = createPerson {
    firstName("John")
    lastName("Hook")
    dateOfBirth(LocalDateTime.now().minusYears(30))
    address("Radlická 714/113 Praha 5")
}
val employee = person.toEmployee("Drug dealer")

