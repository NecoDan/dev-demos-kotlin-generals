package udemy.basic_language.desafio_dado

import br.com.dev.demos.kotlin.generals.utils.RandomicoUtil

/*
*  Criando uma solução para desafio de dados
*
* */
fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Joguinho Desafio Dado .\n")

    fun validarValorPalpite(valor: Int): Boolean {
        return (valor in 1..6)
    }

    fun obterValorPalpiteValido(valorPalpite: Int): Int {
        var valorPalpiteNovo = valorPalpite

        if (validarValorPalpite(valorPalpiteNovo))
            return valorPalpiteNovo

        do {
            print("\nValor do Palpite inválido = $valorPalpiteNovo. Digite um valor válido de 1 à 6: ")
            valorPalpiteNovo = readLine()?.toInt()!!
        } while (!validarValorPalpite(valorPalpiteNovo))

        return valorPalpiteNovo
    }

    val valorDado = RandomicoUtil.gerarValorRandomicoIntAte(6)
    var input: Int

    do {
        print("Digite um palpite de 1 à 6: ")
        var valorPalpite = readLine()?.toInt()!!
        valorPalpite = obterValorPalpiteValido(valorPalpite)

        println("\nPalpite Apostado: {$valorPalpite} | Número Dado: {$valorDado}")

        when (valorPalpite == valorDado) {
            true -> println("\nParabéns! Você acertou!")
            false -> println("\nFoi Mal! Você errou!")
        }

        println("\nDesejas continuar jogando? [1] - SIM ou [2] - NÃO")
        print("Resposta: ")

        input = readLine()?.toInt()!!
        println("\n\n")
    } while (input > 0 && input != 2);

    println("Obrigado por ter jogado!!!")
}
