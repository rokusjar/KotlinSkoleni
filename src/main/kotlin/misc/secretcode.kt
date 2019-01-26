package misc


enum class Color {
    RED, GREEN, WHITE, BLUE, YELLOW;

    companion object
}


fun main() {

    fun Color.Companion.secretCode() = (1..6).map { Color.values().random() }.toList()

    println(Color.secretCode())

    // TODO implement ext. function on enum Color which generates random 6-places color code

}