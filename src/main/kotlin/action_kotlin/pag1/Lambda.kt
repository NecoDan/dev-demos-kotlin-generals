package br.com.dev.demos.kotlin.generals.action_kotlin.pag1

import utils.RandomicoUtil

fun main(args: Array<String>) {

    val somarValoresInteiro = {
        val result: Int = (RandomicoUtil.gerarValorRandomico() + RandomicoUtil.gerarValorRandomico())
        println("Resultado soma: $result")
    }
    somarValoresInteiro()

    println("\n")
    val somarInteirosComParams = { number1: Int, number2: Int ->
        val result: Int = (number1 + number2)
        println("Resultado soma com Params: $result")
    }
    somarInteirosComParams(RandomicoUtil.gerarValorRandomico(), RandomicoUtil.gerarValorRandomico())

    println("\n")
    val multiplicarFunctionRetornandoLambda: (String) -> Int = { valor -> valor.toInt() * valor.toInt() }
    val strParam: String = RandomicoUtil.gerarValorRandomicoIntAte(100).toString()
    println(multiplicarFunctionRetornandoLambda(strParam))

}
