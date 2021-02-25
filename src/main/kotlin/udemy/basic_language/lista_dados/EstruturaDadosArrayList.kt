package udemy.basic_language.lista_dados

import br.com.dev.demos.kotlin.generals.utils.RandomicoUtil

fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Lista Dados ArrayList .\n")

    val listNumeros = arrayListOf<Int>(
            RandomicoUtil.gerarValorRandomicoIntAte(100),
            RandomicoUtil.gerarValorRandomicoIntAte(100),
            RandomicoUtil.gerarValorRandomicoIntAte(100)
    )

    listNumeros.add(RandomicoUtil.gerarValorRandomicoIntAte(100))
    listNumeros.add(RandomicoUtil.gerarValorRandomicoIntAte(100))
    listNumeros.add(RandomicoUtil.gerarValorRandomicoIntAte(100))

    println("Tamanho total da lista = " + listNumeros.size)
    println("")

    println("Elementos contidos na lista:")
    listNumeros.forEach {
        println(it)
    }
    println("")

    listNumeros.addAll(arrayListOf<Int>(
            RandomicoUtil.gerarValorRandomicoIntAte(100),
            RandomicoUtil.gerarValorRandomicoIntAte(100),
            RandomicoUtil.gerarValorRandomicoIntAte(100),
            RandomicoUtil.gerarValorRandomicoIntAte(100))
    )

    println("Tamanho total da lista = " + listNumeros.size)
    println("")

    listNumeros.sort()
    println("Elementos contidos na lista:")
    listNumeros.forEach {
        println(it)
    }
    println("")

    println("Removendo elementos da lista: ...")
    listNumeros.removeIf { it > 50 }
    println("")

    listNumeros.sort()
    println("Elementos contidos na lista:")
    listNumeros.forEach {
        println(it)
    }
    println("")
}
