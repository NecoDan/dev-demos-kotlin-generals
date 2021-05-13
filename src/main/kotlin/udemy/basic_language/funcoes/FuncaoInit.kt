package udemy.basic_language.funcoes

import utils.RandomicoUtil

/*
*  Funções
*
* */
fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Funções .\n")

    val x = RandomicoUtil.gerarValorRandomicoIntAte(1000)
    println("Valor de x = $x")
    val y = RandomicoUtil.gerarValorRandomicoIntAte(1000)
    println("Valor de y = $y")

    println("Resultado SOMA Function 01 = ${soma(x, y)}")
    println("Resultado SOMA Function 02 = ${somaSecond(x, y)}")
    println("Resultado SOMA Function 03 = ${somaThird(x, y)}")

    println("Resultado MULTIPLICACAO Function 01 = ${multiplica(x, y)}")
}

fun soma(x: Int, y: Int): Int {
    return Math.addExact(x, y)
}

fun somaSecond(x: Int, y: Int): Int = Math.addExact(x, y)

fun somaThird(x: Int, y: Int) = Math.addExact(x, y)

fun multiplica(x: Int, y: Int) = Math.multiplyExact(x, y)
