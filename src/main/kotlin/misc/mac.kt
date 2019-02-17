package misc

fun main() {

    // TODO convert mac address form from like 3c970e09485e into form like 3c:97:0e:09:48:5e
    // tips: use extension function "windowed() or chunked()"

    fun macConvert(mac: String): String = mac.windowed(2, 2).joinToString(":")
    fun macConvert2(mac: String): String = mac.chunked(2).joinToString(":")

    println(macConvert("3c970e09485e"))  // should print 3c:97:0e:09:48:5e
    println(macConvert2("3c970e09485e"))  // should print 3c:97:0e:09:48:5e

}