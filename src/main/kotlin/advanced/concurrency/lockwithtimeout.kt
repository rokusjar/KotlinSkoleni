package advanced.concurrency

import java.util.concurrent.TimeUnit.SECONDS
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.thread
import kotlin.concurrent.withLock

inline fun threadName() = Thread.currentThread().name

fun main() {
    // TODO check code for kotlin extension Lock.withLock and implements similar new Lock extension function called withTimeoutLock
    // it will try to acquire lock - use Lock.tryLock() method
    // - if it gets lock it will run lambda action passed as argument
    // - if it is timeouted it will throw TimeoutException
    fun Lock.withTimeoutLock(timeoutInSeconds: Long, action: () -> Unit): Unit = TODO()

    val lock = ReentrantLock()
    thread {
        lock.withLock {
            println("${threadName()} Lock acquired")
            SECONDS.sleep(2)
        }
        println("${threadName()} Lock released")
    }

    thread {
        lock.withTimeoutLock(3) {
            println("${threadName()} Lock acquired")
            SECONDS.sleep(3)
        }
        println("${threadName()} Lock released")
    }

    thread {
        lock.withTimeoutLock(4) {
            println("${threadName()} Lock acquired")
        }
        println("${threadName()} Lock released")
    }.join()

}