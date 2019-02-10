package misc

// TODO (1) reprezentujte v Kotlinu binární strom, který bude reprezentovat obecný algebraický výraz.
// Příklad takového výrazu: 1.2 + 3 * 8 + (16 - 0.5) / 3
// Nápověda: strom se konstruuje tak, že v uzlech jsou operátory a v listech jsou konkrétní číselné hodnoty,
// konstrukce stromu pak respektuje prioritu operátorů.
sealed class Node()
class Value(val value: Number): Node()
class Operator(val left: Node, val right: Node, val operator: (Double, Double) -> Double) : Node()

// Podpůrné extension metody pro snažší ruční vyrábění stromů v testu pro základní operátory,
// nebylo cílem úlohy, je to jen taková hrátka navíc ;-)
operator fun Node.plus(other: Node): Node = Operator(this, other, Double::plus)
operator fun Node.minus(other: Node): Node = Operator(this, other, Double::minus)
operator fun Node.times(other: Node): Node = Operator(this, other, Double::times)
operator fun Node.div(other: Node): Node = Operator(this, other, Double::div)
fun Number.toNode() = Value(this)

// TODO (2) implementujte funkci calculate, která tokáže takový binární strom vyhodnotit
fun Node.calculate(): Double {
    return when(this) {
        is Value -> this.value.toDouble()
        is Operator -> this.operator(this.left.calculate(), this.right.calculate())
    }
}

fun main() {
    // TODO (3) otestujte funkci calculate na různých stromech
    val singleValue = 3.toNode()
    println("Single value: ${singleValue.calculate()}")

    val timesOper = singleValue * 8.toNode()
    println("Times operation: ${timesOper.calculate()}")

    val leftSubTree = 1.2.toNode() + timesOper
    println("Left subtree: ${leftSubTree.calculate()}")

    val rightSubTree = (16.toNode() - 0.5.toNode()) / 3.toNode()
    println("Right subtree: ${rightSubTree.calculate()}")

    println("Final result: ${(leftSubTree + rightSubTree).calculate()}")
}