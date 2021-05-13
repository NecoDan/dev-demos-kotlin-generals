package udemy.basic_language.lista_dados

import utils.RandomicoUtil

/*Sabe-se que:
*  List & MutableList são coleções ordenadas nas quais a ordem de inserção dos elementos são mantidas.
*  List & MutableList permite duplicatas e valores nulos
* */
fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Lista Dados List .\n")

    /*A List é somente leitura (imutável), não pode-se adicionar ou atualizar itens na lista original.*/
    val intList = listOf<Int>(
            RandomicoUtil.gerarValorRandomicoIntAte(1000),
            RandomicoUtil.gerarValorRandomicoIntAte(1000),
            RandomicoUtil.gerarValorRandomicoIntAte(1000)
    )
    println("Tamanho total da lista INT = " + intList.size)
    println("Elementos contidos na lista INT:")
    intList.forEach { println(it) }
    println("")

    val stringList = listOf<String>(
            RandomicoUtil.toStringGerarValorRandomicoIntAte(1000),
            RandomicoUtil.toStringGerarValorRandomicoIntAte(1000),
            RandomicoUtil.toStringGerarValorRandomicoIntAte(1000),
            RandomicoUtil.toStringGerarValorRandomicoIntAte(1000)
    )
    println("Tamanho total da lista STRING = " + stringList.size)
    println("Elementos contidos na lista STRING:")
    stringList.forEach { println(it) }
    println("")

    /*No entanto, a MutableList herda List e suporta acesso de leitura / gravação. Pode-se adicionar, atualizar ou remover elementos.*/
    val intMutableList = mutableListOf<Int>(
            RandomicoUtil.gerarValorRandomicoIntAte(1000),
            RandomicoUtil.gerarValorRandomicoIntAte(1000),
            RandomicoUtil.gerarValorRandomicoIntAte(1000),
            RandomicoUtil.gerarValorRandomicoIntAte(1000)
    )
    intMutableList.add(RandomicoUtil.gerarValorRandomicoIntAte(1000))

    println("Tamanho total da lista MUTABLE INT = " + intList.size)
    println("Elementos contidos na lista MUTABLE INT:")
    intMutableList.forEach { println(it) }
    println("")

    val stringMutableList = mutableListOf<String>(
            RandomicoUtil.toStringGerarValorRandomicoIntAte(1000),
            RandomicoUtil.toStringGerarValorRandomicoIntAte(1000),
            RandomicoUtil.toStringGerarValorRandomicoIntAte(1000),
            RandomicoUtil.toStringGerarValorRandomicoIntAte(1000),
            RandomicoUtil.toStringGerarValorRandomicoIntAte(1000)
    )
    stringMutableList.add(RandomicoUtil.toStringGerarValorRandomicoIntAte(1000))
    println("Tamanho total da lista MUTABLE STRING = " + intList.size)
    println("Elementos contidos na lista MUTABLE STRING:")
    stringMutableList.forEach { println(it) }
    println("")

//    val intMutableListNumericos = mutableListOf(3) { it -> it * 2 }

}
