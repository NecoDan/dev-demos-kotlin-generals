package br.com.dev.demos.kotlin.generals.udemy.basic_language.aula5

import java.time.LocalDate

fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Leitura de Dados - Entrada de dados c/ ReadLine.\n")

    // Variaveis mutaveis - podem sofrer alterações em tempo de execução
    var anoNascimento = 1989
    var anoAtual = LocalDate.now().year
    var idade = anoAtual - anoNascimento
    println("Idade eh = $idade")

    anoNascimento = 2002
    anoAtual = LocalDate.now().year
    idade = anoAtual - anoNascimento
    println("Idade eh = $idade")

    println("\n######################################################\n")

    // Variaveis imutaveis - não podem sofrer alterações
    val PI = 3.14
    println("Valor de PI eh = $PI")

}
