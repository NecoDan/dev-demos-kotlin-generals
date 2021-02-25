package br.com.dev.demos.kotlin.generals.action_kotlin.pag1

fun main(args: Array<String>) {
    println("\n")
    val a: Int = 10
    println("Valor de a: $a");

    val b = 12
    println("Valor de b: $b");

    val c: Float
    c = b.toFloat()
    println("Valor de b: $c");

    println("\n")
    val message = """
    Hello """

    val author = """
        Teste Cabral
        """
    println("Mensagem is: $message $author")

    val isOdd = if ((7 % 2) == 0) true else false
    println("Dever ser FALSO: $isOdd")

    println("\n\n Iterando por uma lista de caracteres/strings retornando o conteudo de cada posição")
    val nomePessoa = "Daniel"
    for (letra in nomePessoa)
        println(letra)

    println("\n\n Iterando por uma lista e retornando os indices")
    for (index in nomePessoa.indices)
        print("{pos $index},")

    println("\n\n Iterando por uma lista de caracteres/strings retornando o indice e conteudo")
    for ((index, letra) in nomePessoa.withIndex())
        print("$index: ($letra) ")

    println("\n\n Iterando por uma lista de valores inteiros")
    for (i in 1..10)
        print("$i, ")

    println("\n\n Iterando por uma lista de valores inteiros, removendo o ultimo elemento")
    for (i in 1 until 10)
        print("$i, ")

    println("\n\n Iterando por uma lista de valores inteiros, revertendo a ordem")
    for (i in 10 downTo 1)
        print("$i, ")

    println("\n\n Iterando por uma lista de valores caracteres/string, revertendo a ordem")
    for (i in 'z' downTo 'a')
        print("$i, ")

    println("\n\n Iterando por uma lista de valores inteiros, pulando um intervalo definido")
    for (i in 1..30 step 3)
        print("$i, ")
}

