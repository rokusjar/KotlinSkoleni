package advanced.concurrency

import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.thread
import kotlin.concurrent.withLock


fun main() {

    var count = 0

    // TODO (1) - creates list of 2000 threads - running block will be "count++"
    // be sure that threads are created but not started
    val threads = List(2000) {
        thread(start = false) { count++ }
    }

    // TODO (2) - for each thread call start()
    threads.forEach { it.start() }

    // TODO (3) - wait for all threads finished their job
    threads.last().join()

    println("count: $count")

    // TODO (4) - solve race condition - print should output each time 2000 (not less)

    /** SOLUTION I - using lock */
    val lock = ReentrantLock()
    count = 0
    List(2000) {
        thread(start = false) {
            lock.withLock { count++ }
        }
    }.run {
        forEach { it.start() }
        last().join()
    }
    println("I: count: $count")

    /** SOLUTION II - using synchronized */
    val lockObject = Any()
    count = 0
    List(2000) {
        thread(start = false) {
            synchronized(lockObject) { count++ }
        }
    }.run {
        forEach { it.start() }
        last().join()
    }
    println("II. count: $count")

    /** SOLUTION III - using atomic integer */
    val count2 = AtomicInteger(0)
    List(2000) {
        thread(start = false) {
            count2.incrementAndGet()
        }
    }.run {
        forEach { it.start() }
        last().join()
    }
    println("III. count: $count2")


}

