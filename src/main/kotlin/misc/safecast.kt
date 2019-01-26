package misc

fun main() {

    val s = TODO()
    println(s as? Int)    // null
    println(s as Int?)    // exception

    // Safe casts
    //
    // Type cast as throws ClassCastException, if the cast is unsuccessful.
    // Safe cast as? returns null, if the cast is unsuccessful.
    //
    // TODO Declare the s variable to make the first line print null and the second one throw an exception.

}