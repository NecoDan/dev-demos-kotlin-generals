package udemy.basic_language.estrutura_controle

import br.com.dev.demos.kotlin.generals.utils.RandomicoUtil

/*
*  Estrutura de repetição For
*
* */
fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Estrutura Controle - For .\n")

    val numeros = arrayListOf<Int>(
            RandomicoUtil.gerarValorRandomicoIntAte(1000),
            RandomicoUtil.gerarValorRandomicoIntAte(1000),
            RandomicoUtil.gerarValorRandomicoIntAte(1000),
            RandomicoUtil.gerarValorRandomicoIntAte(1000),
            RandomicoUtil.gerarValorRandomicoIntAte(1000),
            RandomicoUtil.gerarValorRandomicoIntAte(1000),
    )

    println("Tamanho total da lista: ${numeros.size}")
    for (num in numeros) {
        println("Elemento [${numeros.indexOf(num)}]: $num")
    }
}
