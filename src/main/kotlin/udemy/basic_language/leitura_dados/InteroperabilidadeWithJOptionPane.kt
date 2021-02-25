package udemy.basic_language.leitura_dados

import javax.swing.JOptionPane

fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Leitura Dados JOptionPane.\n")

    val nomeUsuario = JOptionPane.showInputDialog("Digite o nome do usuário")
    println("Nome usuario digitado: $nomeUsuario")

    val nomeUsuarioSaida = String.format("%s %s", "Bem-vindo", nomeUsuario)
    JOptionPane.showMessageDialog(null, nomeUsuarioSaida)
}
