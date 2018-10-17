package oop

class Rectangle(private val length: Double, private val width: Double) {

    // TODO (1) přesuňte do abstraktní třídy Shape
    fun area(): Double = length * width

    // TODO (1) přesuňte do abstraktní třídy Shape a slovo Rectangle nahraďte property
    fun draw(x: Int, y: Int) = println("Rectangle has been drawn on these coordinates x: $x y: $y")
}