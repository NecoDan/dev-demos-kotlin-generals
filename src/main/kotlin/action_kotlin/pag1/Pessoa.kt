package br.com.dev.demos.kotlin.generals.action_kotlin.pag1

data class Pessoa(val nome: String,
                  val idade: Int? = null)

fun main(args: Array<String>) {
    val pessoas = listOf(
            Pessoa("Daniel"),
            Pessoa("Marcos", 30)
    )

    // usando o operador Elvis { ?: }
    val pessoaMaiorIdade = pessoas.maxBy { it.idade ?: 0 }
    println("A maior idade eh: $pessoaMaiorIdade");
}

