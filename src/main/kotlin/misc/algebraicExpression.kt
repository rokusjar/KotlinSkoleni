package misc

// TODO (1) reprezentujte v Kotlinu binární strom, který bude reprezentovat obecný algebraický výraz.
// Příklad takového výrazu: 1.2 + 3 * 8 + (16 + 0.5) / 3
// Nápověda: strom se konstruuje tak, že v uzlech jsou operátory a v listech jsou konkrétní číselné hodnoty,
// konstrukce stromu pak respektuje prioritu operátorů.
sealed class Node()
class Value(val value: Double): Node()
class Operator(val left: Node, val right: Node, val operator: (Double, Double) -> Double) : Node()

// TODO (2) implementujte funkci calculate, která tokáže takový binární strom vyhodnotit
fun Node.calculate(): Double {
    return when(this) {
        is Value -> this.value
        is Operator -> this.operator(this.left.calculate(), this.right.calculate())
    }
}

fun main() {
    // TODO (3) otestujte funkci calculate na různých stromech
    val singleValue = Value(3.0)
    println("Result: ${singleValue.calculate()}")

    val timesOper = Operator(singleValue, Value(8.0), Double::times)
    println("Result: ${timesOper.calculate()}")

    val leftSubTree = Operator(Value(1.2), timesOper, Double::plus)
    println("Result: ${leftSubTree.calculate()}")

    val rightSubTree = Operator(
                        Operator(Value(16.0), Value(0.5), Double::plus),
                        Value(3.0),
                        Double::div)
    println("Final result: ${Operator(leftSubTree, rightSubTree, Double::plus).calculate()}")
}