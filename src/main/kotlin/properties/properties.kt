package properties


class Person(val firstName: String, val lastName: String) {

    // TODO (1) Přidejte property fullName s custom getterm, která bude spojovat firstName a lastName

    /*
        TODO (2) Přidejte property nickname typu var s výchozí hodnotou Unknown, custom getterem který vrátí "firstName AKA nickname"
        TODO a custom setterm který nejdřív zkontroluje nastavovanou hodnotu a nastaví ji pouze pokud není blank
     */


    // TODO (3) Přidejte lateinit property fullNameWithNickname a metodu setup která ji inicializuje

    // TODO (4) Přidejte property age a delegujte ji na existujícího delegáta observable. Pomocí něj vypište do konzole jak se mění hodnota age
}


fun main(args: Array<String>) {

    // TODO vyzkoušejte třídu Person
}