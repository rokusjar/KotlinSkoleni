package oop

class Shape {
    // TODO (1.1) Doplntě property která bude popisovat o jaký tvar se jedná (Rectangle, Circle)
}

class Circle(private val radius: Double) {

    // TODO (1.2) použijte třídu Shape jako abstratkního předka

    // TODO (1.3) funkci area deklarujte v předkovi jako abstraktní
    fun area(): Double = Math.PI * radius * radius

    // TODO (1.4) přesuňte do abstraktní třídy Shape a slovo Circle nahraďte property
    fun draw(x: Int, y: Int) = println("Circle has been drawn on these coordinates x: $x y: $y")
}

class Rectangle(private val length: Double, private val width: Double) {

    // TODO (1.5) použijte třídu Shape jako abstratkního předka

    // TODO (1.6) funkci area deklarujte v předkovi jako abstraktní
    fun area(): Double = length * width

    // TODO (1.7) přesuňte do abstraktní třídy Shape a slovo Rectangle nahraďte property
    fun draw(x: Int, y: Int) = println("Rectangle has been drawn on these coordinates x: $x y: $y")

    // TODO (6.1) přidejte sekundární konstruktor, který bude přijímat pouze jeden rozměr, objekt bude představovat čtverec.

    // TODO (6.2) zajistěte, že se při vytvoření objektu Rectangle vypíše do konzole, zda se jedná o čtverec, nebo ne
}

fun main(args: Array<String>) {

    // TODO (1) přepracujte třídy Rectangle, Circle a Shape

    // TODO (2) inicializujte kolekci, naplňte ji různými tvary (Rectangle, Circle)
    val shapes: List<Shape> = listOf(Shape(), Shape(), Shape())

    // TODO (3) pro každý tvar v kolekci shapes vypište do konzole jeho typ a obsah pomocí funkce println()

    // TODO (4) Abstraktní třídu nahraďte rozhraním

    // TODO (5) Doplňte do kolekce shapes čtverec, který definujete pomocí anonymní třídy

    // TODO (6) Doplntě další konstruktor pro třídu Rectangle
}