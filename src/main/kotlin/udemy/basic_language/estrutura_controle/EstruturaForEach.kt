package udemy.basic_language.estrutura_controle

import br.com.dev.demos.kotlin.generals.utils.RandomicoUtil
import java.math.BigDecimal

/*
*  Estrutura de repetição For
*
* */
fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Estrutura Controle - ForEach .\n")

    val numeros = arrayListOf<Double>(
            RandomicoUtil.gerarValorRandomicoDoubleAteCom(1000.00, 2),
            RandomicoUtil.gerarValorRandomicoDoubleAteCom(1000.00, 2),
            RandomicoUtil.gerarValorRandomicoDoubleAteCom(1000.00, 2),
            RandomicoUtil.gerarValorRandomicoDoubleAteCom(1000.00, 2),
            RandomicoUtil.gerarValorRandomicoDoubleAteCom(1000.00, 2),
            RandomicoUtil.gerarValorRandomicoDoubleAteCom(1000.00, 2),
            RandomicoUtil.gerarValorRandomicoDoubleAteCom(1000.00, 2),
            RandomicoUtil.gerarValorRandomicoDoubleAteCom(1000.00, 2),
            RandomicoUtil.gerarValorRandomicoDoubleAteCom(1000.00, 2),
            RandomicoUtil.gerarValorRandomicoDoubleAteCom(1000.00, 2),
    )

    println("Tamanho total da lista: ${numeros.size}")

    /*Percorrendo todos os elementos*/
    numeros.forEach { num ->
        println("Elemento [${numeros.indexOf(num)}]: $num")
    }

    /*Percorrendo elementos individualmente, efetuando uma ação  e/ou operação pra retornar uma nova lista*/
    val numerosList = numeros
            .filter { num -> num > 100.00 }
            .map { num -> num * 2.0 }
            .toList()

    println("")
    println("Tamanho total da nova lista: ${numerosList.size}")
    numerosList.forEach { num ->
        println("Elemento [${numerosList.indexOf(num)}]: $num")
    }
}
