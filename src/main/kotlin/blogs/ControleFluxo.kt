package blogs

import utils.RandomicoUtil

fun main(args: Array<String>) {
    println("Blog - Controle de Fluxo.\n")
    println("\n\n ################################################################################ \n")

    var peso = RandomicoUtil.gerarValorRandomicoDoubleAte(300.00)
    println("Valor Peso 1: $peso")

    peso = RandomicoUtil.gerarValorRandomicoDoubleAte(300.00)
    println("Valor Peso 2: $peso")

    var altura = RandomicoUtil.gerarValorRandomicoDoubleAte(3.00)
    println("Valor Altura: $altura")

    if (altura!! > 1.9) {
        println("Gigante")
    } else {
        println("Normal")
    }

    altura = RandomicoUtil.gerarValorRandomicoDoubleAte(3.00)
    if (altura!! > 1.9) println("Gigante") else println("Normal")

    println("\n\n ################################################################################ \n")
    var alturaYoda = RandomicoUtil.gerarValorRandomicoDecimalAte(1.00)?.toDouble()
    var alturaAnakin = RandomicoUtil.gerarValorRandomicoDecimalAte(2.00)?.toDouble()
    var maiorAltura: Double

    maiorAltura = if (alturaYoda!! > alturaAnakin!!) {
        alturaYoda
    } else {
        alturaAnakin
    }

    println("Valor Maior Altura: $maiorAltura")

    println("\n\n ################################################################################ \n")

    alturaYoda = RandomicoUtil.gerarValorRandomicoDecimalAte(1.00)?.toDouble()
    alturaAnakin = RandomicoUtil.gerarValorRandomicoDecimalAte(2.00)?.toDouble()
    maiorAltura = if (alturaYoda!! > alturaAnakin!!) alturaYoda else alturaAnakin
    println("Valor Maior Altura: $maiorAltura")

    println("\n\n ################################################################################ \n")
}

