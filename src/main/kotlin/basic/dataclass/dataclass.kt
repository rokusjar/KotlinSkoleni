package basic.dataclass

sealed class Expression

data class Const(val number: Double) : Expression()

data class Sum(val e1: Expression, val e2: Expression) : Expression()

fun main(args: Array<String>) {

    val expressions = listOf(
            Const(5.0),
            Sum(Const(2.0), Const(4.0))
    )

    // TODO (1) vytvořte funkci eval, která jako jediný parametr přijme Expression a vrátí jeho výsledek
    fun eval(expr: Expression): Double = when (expr) {
        is Const -> expr.number
        is Sum -> eval(expr.e1) + eval(expr.e2)
    }

    // TODO (2) pro každý výraz v kolekci expressions vypište do konzole výsledek výrazu
    expressions.forEach { println(eval(it)) }

    // TODO (3) třídu Expression označte jako sealed class a sledujte co se stane
}
