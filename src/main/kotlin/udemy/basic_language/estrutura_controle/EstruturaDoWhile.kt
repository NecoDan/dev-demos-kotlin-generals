package udemy.basic_language.estrutura_controle

/*
*  Estrutura de repetição Do/While
*
* */
fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Estrutura Controle - Do While .\n")
    val numeros = arrayListOf<Int>()

    var tamanho = 0
    do {
        numeros.add(tamanho++)
        println("Tamanho total da lista: ${numeros.size}")
    } while (numeros.size != 15)
}
