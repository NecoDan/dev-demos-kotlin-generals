package com.kotlin.estudonauta.testes

fun main(args: Array<String>) {

    // Estaticos.limites()
    // Estaticos.inferencia()
    Estaticos.tipoAny()

}

class Estaticos{
    companion object ESTATICO {

        // LIMITES
        fun limites(){
            println("\n Range do tipo PRIMITIVO SHORT:")
            println("Valor MINIMO = " + Short.MIN_VALUE)
            println("Valor MAXIMO = " + Short.MAX_VALUE)

            println("\n Range do tipo PRIMITIVO BYTE:")
            println("Valor MINIMO = " + Byte.MIN_VALUE)
            println("Valor MAXIMO = " + Byte.MAX_VALUE)

            println("\n Range do tipo PRIMITIVO INT:")
            println("Valor MINIMO = " + Int.MIN_VALUE)
            println("Valor MAXIMO = " + Int.MAX_VALUE)

            println("\n Range do tipo PRIMITIVO FLOAT:")
            println("Valor MINIMO = " + Float.MIN_VALUE)
            println("Valor MAXIMO = " + Float.MAX_VALUE)
        }

        // INFERÊNCIA
        fun inferencia(){
            var num1:Int = 10
            var num2 = 20
            println(num2 is Int)

            val temperatura1:Float = 21.5F
            val temperartura2 = 40F
            print (temperartura2 is Float)
        }

        // ANY
        fun tipoAny(){
            var aux:Any

            aux = 10
            println(aux)

            aux = "Daniel"
            println(aux)

            aux = 12.4
            println(aux)
        }
    }
}

