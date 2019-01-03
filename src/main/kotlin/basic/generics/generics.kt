package basic.generics

interface Eatable
open class Fruit
class Apple : Fruit(), Eatable

// TODO (1) Doplňte omezení pro generický typ T, měl by dědit třídu Fruit a implementovat rozhraní Eatable
class FruitBasket<T>

interface FruitComparator<T> {
    fun compare(first: T, second: T)
}

class FruitProducer<T> {
    fun produceFruit(): T = TODO("Pro účely tohoto cvičení není třeba implementovat")
}

fun main(args: Array<String>) {

    val fruitComparator: FruitComparator<Fruit> = object : FruitComparator<Fruit> {
        override fun compare(first: Fruit, second: Fruit) = TODO("Pro účely tohoto cvičení není třeba implementovat")
    }

    // TODO (2) Uložte do proměnné appleComparator připravený fruitComparator. Upravte kód tak, aby nehlásil chybu.
    val appleComparator: FruitComparator<Apple>


    val appleProducer: FruitProducer<Apple> = FruitProducer()

    // TODO (3) Uložte do proměnné fruitProducer připravený appleProducer. Upravte kód tak, aby nehlásil chybu.
    val fruitProducer: FruitProducer<Fruit>
}
