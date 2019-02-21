package advanced.concurrency

import java.util.concurrent.CountDownLatch
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.thread
import kotlin.concurrent.withLock


fun main() {

    val threadsCount = 2000
    run {
        var count = 0

        // TODO (1) - creates list of 2000 threads - running block will be "count++"
        // be sure that threads are created but not started
        val threads = List(threadsCount) {
            thread(start = false) { count++ }
        }
        // TODO (2) - for each thread call start()
        threads.forEach { it.start() }

        // TODO (3) - wait for all threads finished their job
        threads.forEach { it.join() }

        println("count: $count")
    }

    // TODO (4) - solve race condition - print should output each time 2000 (not less)

    /** SOLUTION I - using lock */
    run {
        val lock = ReentrantLock()
        var count = 0
        List(threadsCount) {
            thread(start = false) {
                lock.withLock { count++ }
            }
        }.run {
            forEach { it.start() }
            forEach { it.join() }
        }
        println("I: count: $count")
    }

    /** SOLUTION II - using synchronized + latch*/
    run {
        val lockObject = Any()
        val latch = CountDownLatch(threadsCount)
        var count = 0
        List(threadsCount) {
            thread(start = false) {
                synchronized(lockObject) { count++ }
                latch.countDown()
            }
        }.run {
            forEach { it.start() }
            latch.await()
        }
        println("II. count: $count")
    }

    /** SOLUTION III - using atomic integer + latch*/
    run {
        val count = AtomicInteger(0)
        val latch = CountDownLatch(threadsCount)
        List(threadsCount) {
            thread(start = false) {
                count.incrementAndGet()
                latch.countDown()
            }
        }.run {
            forEach { it.start() }
            latch.await()
        }
        println("III. count: $count")
    }


}

