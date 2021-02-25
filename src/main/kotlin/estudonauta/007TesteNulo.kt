package com.kotlin.estudonauta.testes

// KOTLIN tem NULL-SAFETY
fun main(args: Array<String>) {

    // EstaticosTesteNulo.safeCall()

    EstaticosTesteNulo.elvis()

}


class EstaticosTesteNulo {
    companion object ESTATICO {

        // SAFE CALL = ?
        // Pode ser um nome, pode ser nulo por algum motivo ou pode estar vazia!
        fun safeCall(){
            var nome:String?
            nome = null
            print(nome)
        }

        // ELVIS = ?:
        // Determina o valor a ser atribuido de acordo com o operador, ou seja, estabelece uma condicional
        // a ser atribuido a variavel
        fun elvis(){
            var a:Int?
            var b:Int

            a = 10
            b = a

            println("A vale = $a")
            println("B vale = $b")

            a = null
            b = a?:0

            println("A vale = $a")
            println("B vale = $b")
        }

        // NULL-CHECK = !!
        //
        fun nullCheck(){

        }

    }
}

