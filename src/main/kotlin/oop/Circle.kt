package oop

class Circle(private val radius: Double) {

    // TODO (1) přesuňte do abstraktní třídy Shape
    fun area(): Double = Math.PI * radius * radius

    // TODO (1) přesuňte do abstraktní třídy Shape a slovo Circle nahraďte property
    fun draw(x: Int, y: Int) = println("Circle has been drawn on these coordinates x: $x y: $y")
}