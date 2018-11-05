package basic.properties

import kotlin.properties.Delegates


class Person(val firstName: String, val lastName: String) {

    // TODO (1) Přidejte property fullName s custom getterm, která bude spojovat firstName a lastName
    val fullName: String
        get() = "${this.firstName} ${this.lastName}"

    /*
    TODO (2) Přidejte property nickname typu var s výchozí hodnotou Unknown, custom getterem který vrátí "firstName AKA nickname"
    TODO a custom setterm který nejdřív zkontroluje nastavovanou hodnotu a nastaví ji pouze pokud není blank
    */
    var nickname: String = "Unknown"
        get() = "$firstName AKA $field"
        set(value) {
            if (value.isNotBlank()) field = value
        }


    // TODO (3) Přidejte lateinit property adress typu Adress a metodu setupAdress která ji inicializuje
    lateinit var adress: Adress

    fun setupAdress() {
        adress = Adress("London", "Baker street")
    }

    // TODO (4) Přidejte property age a delegujte ji na existujícího delegáta observable. Pomocí něj vypište do konzole jak se mění hodnota age
    var age: Int by Delegates.observable(0,
            onChange = { property, oldValue, newValue -> println("Age changed from $oldValue to $newValue") })
}

class Adress(val city: String, val street: String) {
    override fun toString(): String = "$street, $city"
}


fun main(args: Array<String>) {

    // TODO vyzkoušejte třídu Person

    val person = Person("John", "Wick")
    person.nickname = "Bogeyman"

    println("Full name: ${person.fullName}")
    println("Nickname: ${person.nickname}")

    person.setupAdress()
    println("Adress: ${person.adress}")

    person.age = 32
    println("Age: ${person.age}")
}
