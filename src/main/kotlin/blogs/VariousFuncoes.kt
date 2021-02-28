package blogs

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

class Person(val name: String) {
    private val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}

fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println("Valor Soma= ${sum(1, 2)}")
    println("Valor Multiplicacao= ${multiply(2, 4)}")

    /* Infix Functions
    *  Funções de membro e extensões com um único parâmetro podem ser transformadas em funções infixas.
    *
    * */
    println("\nInfix Functions")
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val person1 = Person("Augusto")
    println(person1.name)

    val person2 = Person("Claudia")
    println(person2.name)
}
