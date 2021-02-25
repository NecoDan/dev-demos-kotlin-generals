package udemy.basic_language.operadores_logicos

import br.com.dev.demos.kotlin.generals.utils.RandomicoUtil

fun main(args: Array<String>) {
    println("Udemy - Aprenda o básico da linguagem Kotlin: Operadores Logicos - 01.\n")

    var number1 = RandomicoUtil.gerarValorRandomico()
    var number2 = RandomicoUtil.gerarValorRandomico()
    println(number1 != number2).toString().toUpperCase()
    println(!(number1 != number2)).toString().toUpperCase()

    number1 = RandomicoUtil.gerarValorRandomico()
    number2 = RandomicoUtil.gerarValorRandomico()
    println(number1 == number2).toString().toUpperCase()
    println(number1 is Int).toString().toUpperCase()

    println("\n######################################################\n")
    println("Udemy - Aprenda o básico da linguagem Kotlin: Operadores Logicos - 02.\n")

    var number3 = RandomicoUtil.gerarValorRandomico()
    var number4 = RandomicoUtil.gerarValorRandomico()
    println(number3 > number4).toString().toUpperCase()
    println(number3 < number4).toString().toUpperCase()
    println(number3 >= number4).toString().toUpperCase()
    println(number3 <= number4).toString().toUpperCase()

//    println(number3 is String)
//    println(number4 is String)

    println("\n######################################################\n")
    println("Udemy - Aprenda o básico da linguagem Kotlin: Operadores Logicos - 03.\n")

    var number5 = RandomicoUtil.gerarValorRandomico()
    number5 += 2
    println(number5).toString().toUpperCase()

    number5 -= 2
    println(number5).toString().toUpperCase()

    number5 *= 2
    println(number5).toString().toUpperCase()

    number5 /= 2
    println(number5).toString().toUpperCase()

}
