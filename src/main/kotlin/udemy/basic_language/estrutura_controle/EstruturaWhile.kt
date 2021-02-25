package udemy.basic_language.estrutura_controle

/*
*  Estrutura de repetição While
*
* */
fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Estrutura Controle - While .\n")
    val numeros = arrayListOf<Int>()

    var tamanho = 0
    while (numeros.size != 15) {
        numeros.add(tamanho++)
        println("Tamanho total da lista: ${numeros.size}")
    }
}
