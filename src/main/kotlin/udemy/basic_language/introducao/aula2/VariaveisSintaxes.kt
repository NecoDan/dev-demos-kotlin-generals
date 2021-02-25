package br.com.dev.demos.kotlin.generals.udemy.basic_language.aula2

import kotlin.random.Random

fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Variaveis e Sintaxes.")

    val inteiro = 0
    println("Valor inicial da variavel inteiro =  $inteiro")

    var inteiro2: Int = Random.nextInt(10000)
    println("Valor inicial da variavel inteiro2 =  $inteiro2")

    var nome = "Daniel"
    println("Valor nome =  $nome")
    nome = "Daniel Santos"
    println("Novo nome =  $nome")

    val x: Int
    x = Random.nextInt(10000)
    println("$x")

    val y: Double = Random.nextDouble(Double.MIN_VALUE, 10.00)
    println("$y")

    val z: Float = Random.nextFloat()
    println("$z")

    val w: String = Random.nextInt(1000).toString()
    println(w)

    val tipoMasculino = 'M'
    println(tipoMasculino)
}
