package advanced.concurrency

import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

fun main() {

    // TODO Write a program that implements sleep sort.
    // for each number N from list is created thread which executes command to sleep for N seconds and after number N is printed
    fun sleepSort(numbers: List<Int>) {
        numbers.forEach {
            thread {
                TimeUnit.SECONDS.sleep(it.toLong())
                println(it)
            }
        }
    }

    val numbers = List(20) { (0..10).random() }
    sleepSort(numbers)

}