package udemy.basic_language.lista_dados

import java.util.*

fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Lista Dados Arrays .\n")

    // criando o array
    val arrayPaises = arrayOf("Brasil", "Inglaterra", "Holanda", "Angola", "Cuba")
    val arrayPaises2 = Array(12) { 3 }

    // acessando array
    println("Tamanho = " + arrayPaises.count())
    println("Primeiro elemento do array = " + arrayPaises[0])
    println("")

    println("# Ordenado pelas posições iniciais:")
    arrayPaises.forEach {
        println("$it")
    }
    println("")

    arrayPaises.reverse()
    println("# Revertendo a ordem o array:")
    arrayPaises.forEach {
        println("$it")
    }
    println("")

    println("# Ordenado pelo tamanho caracteres elemento no array:")
    arrayPaises.sortBy { it.length > 4 }
    arrayPaises.forEach {
        println("$it")
    }
    println("")

    arrayPaises.sort()
    println("# Ordenado por nome:")
    arrayPaises.forEach {
        println("$it")
    }
    println("")

    println("# Efetuando a busca no array:")
    arrayPaises.sort()
    var pos = Arrays.binarySearch(arrayPaises, "Inglaterra")
    println("Posicao encontrada: $pos")

    pos = Arrays.binarySearch(arrayPaises, "Brasil")
    println(arrayPaises[pos])

    arrayPaises[pos] = "BRAZIL"
    println(arrayPaises[pos])


}
