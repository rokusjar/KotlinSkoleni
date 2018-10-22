package basic.generics

interface Eatable
open class Fruit
class Apple : Fruit(), Eatable

class FruitBasket<T> where T : Fruit, T : Eatable

interface FruitComparator<in T> {
    fun compare(first: T, second: T)
}

class FruitProducer<out T> {
    fun produceFruit(): T = TODO("Pro účely tohoto cvičení není třeba implementovat")
}

fun main(args: Array<String>) {

    val fruitComparator: FruitComparator<Fruit> = object : FruitComparator<Fruit> {
        override fun compare(first: Fruit, second: Fruit) = TODO("Pro účely tohoto cvičení není třeba implementovat")
    }
    val appleComparator: FruitComparator<Apple> = fruitComparator


    val appleProducer: FruitProducer<Apple> = FruitProducer()
    val fruitProducer: FruitProducer<Fruit> = appleProducer
}
