package udemy.basic_language.operadores_condicionais

import utils.RandomicoUtil

fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Operadores Condicionais - 00.\n")

    /*funções*/
    fun validarParOuImpar(valor: Int) {
        if ((valor % 2) == 0) {
            println("$valor eh par!")
        } else {
            println("$valor eh impar!")
        }
    }

    fun imprimirMensagemIdade(mensagem: String, idade: Int) {
        println("$idade anos se refere a um(a) $mensagem")
    }

    fun validarParamIdade(idade: Int): Boolean {
        if (idade <= 0) {
            println("Idade inválida e/ou desconhecida!")
            return true;
        }
        return false;
    }

    fun validarIdadeSemWhen(idade: Int) {
        if (validarParamIdade(idade))
            return

        if (idade in 1..11) {
            imprimirMensagemIdade("Criança", idade)
        } else if (idade in 12..17) {
            imprimirMensagemIdade("Adolescente", idade)
        } else if (idade in 18..29) {
            imprimirMensagemIdade("Jovem", idade)
        } else if (idade in 30..65) {
            imprimirMensagemIdade("Adulto(a)", idade)
        } else {
            imprimirMensagemIdade("Idoso(a)", idade)
        }
    }

    fun validarIdadeComWhen(idade: Int) {
        if (validarParamIdade(idade))
            return

        when (idade) {
            in 1..11 -> imprimirMensagemIdade("Criança", idade)
            in 12..17 -> imprimirMensagemIdade("Adolescente", idade)
            in 18..29 -> imprimirMensagemIdade("Jovem", idade)
            in 30..65 -> imprimirMensagemIdade("Adulto", idade)
            else -> {
                imprimirMensagemIdade("Idoso", idade)
            }
        }
    }

    println("Udemy - Aprenda o básico da linguagem Kotlin: Operadores Condicionais - 01.\n")
    validarParOuImpar(RandomicoUtil.gerarValorRandomicoIntAte(1000))

    println("\n###################################################################################\n")
    println("Udemy - Aprenda o básico da linguagem Kotlin: Operadores Logicos - 02.\n")
    validarIdadeComWhen(RandomicoUtil.gerarValorRandomicoIntAte(150))

    println("\n####################################################################################\n")
    println("Udemy - Aprenda o básico da linguagem Kotlin: Operadores Logicos - 03.\n")

    println("Digite um número: ")
    val valor = readLine()?.toInt()!!
    validarParOuImpar(valor)
}
