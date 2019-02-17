package advanced.misc

import java.math.BigInteger

fun main() {

    //https@ //www.baeldung.com/kotlin-tail-recursion

    tailrec fun fibonacci(n: Int, a: BigInteger = BigInteger("0"), b: BigInteger = BigInteger("1")): BigInteger =
            if (n == 0) a else fibonacci(n - 1, b, a + b)

    fun factorial(n: Long): Long = if (n <= 1L) 1L else n * factorial(n - 1L)

    println("Hello world ${fibonacci(100000)}")
    //println("Hello world ${factorial(100000)}")

}


