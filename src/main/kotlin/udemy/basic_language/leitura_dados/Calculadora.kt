package udemy.basic_language.leitura_dados

fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Leitura Dados.\n")

    // !! - quer dizer que dever considerar o valor como não NULO

    println("Digite o valor de A:")
    val valorA = readLine()?.toInt()!!

    println("Digite o valor de B:")
    val valorB = readLine()?.toInt()!!

    val resultado = Math.addExact(valorA, valorB)
    println("######################################################\n")
    println("Resultado (1A+B) = $resultado")

}
