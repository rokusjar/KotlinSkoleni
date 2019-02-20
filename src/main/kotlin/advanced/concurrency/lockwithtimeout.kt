package advanced.concurrency

import java.util.concurrent.TimeUnit
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.thread
import kotlin.concurrent.withLock

fun main() {
    // TODO check code for kotlin extension Lock.withLock and implements similar new Lock extension function called withTimeoutLock
    // it will try to acquire lock - use Lock.tryLock() method
    // - if it gets lock it will run lambda action passed as argument
    // - if it is timeouted it will throw TimeoutException
    fun Lock.withTimeoutLock(timeoutInSeconds: Long, action: () -> Unit): Unit = TODO()

    val lock = ReentrantLock()
    thread {
        lock.withLock {
            println("${Thread.currentThread().name} Lock acquired")
            TimeUnit.SECONDS.sleep(2)
        }
        println("${Thread.currentThread().name} Lock released")
    }

    thread {
        lock.withTimeoutLock(3) {
            println("${Thread.currentThread().name} Lock acquired")
            TimeUnit.SECONDS.sleep(2)
        }
        println("${Thread.currentThread().name} Lock released")
    }.join()

    thread {
        lock.withTimeoutLock(1) {
            println("${Thread.currentThread().name} Lock acquired")
        }
        println("${Thread.currentThread().name} Lock released")
    }.join()

}