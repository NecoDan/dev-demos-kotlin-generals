package br.com.dev.demos.kotlin.generals.udemy.basic_language.aula4

import kotlin.random.Random

fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Conversão Tipos Primitivos.")

    val inteiro = Random.nextInt(1000)
    println("Valor do inteiro $inteiro")

    val inteiroStr = inteiro.toString()
    println("Valor do inteiro em String $inteiroStr")

    val inteiroByte = inteiro.toByte()
    println("Valor do inteiro em Byte $inteiroByte")

    val inteiroFloat = inteiro.toFloat()
    println("Valor do inteiro em Float $inteiroFloat")

    println("\n######################################################\n")

    val texto = Random.nextInt(1000).toString()

    val numero = texto.toInt()
    println("Valor do numero inicial = $numero")

    val valorSoma = numero + Random.nextInt(1000)
    println("Valor da Soma = $valorSoma")

}

