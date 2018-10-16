package basic.properties

import kotlin.properties.Delegates


class Person(val firstName: String, val lastName: String) {

    val fullName: String
        get() = "${this.firstName} ${this.lastName}"

    var nickname: String = "Unknown"
        get() = "$firstName AKA $field"
        set(value) {
            if (value.isNotBlank()) field = value
        }


    // TODO (3) Přidejte lateinit property adress typu Adress a metodu setupAdress která ji inicializuje
    lateinit var adress: Adress

    fun setup() {
        adress = Adress("London", "Baker street")
    }

    var age: Int by Delegates.observable(0,
            onChange = { property, oldValue, newValue -> println("Age changed from $oldValue to $newValue") })
}

class Adress(val city: String, val street: String)


fun main(args: Array<String>) {
    val person = Person("John", "Wick")
    person.nickname = "Bogeyman"

    println("Full name: ${person.fullName}")
    println("Nickname: ${person.nickname}")

    person.setup()
    println("Full name with nickname: ${person.adress}")

    person.age = 32
    println("Age: ${person.age}")
}
