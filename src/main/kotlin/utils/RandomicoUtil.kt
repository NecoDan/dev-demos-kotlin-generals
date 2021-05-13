package utils

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

/**
 * @author Daniel Santos
 */
object RandomicoUtil {

    private const val LIMITE_MAX_RANDOMICO_INTEIRO = 500000
    private const val LIMITE_MAX_RANDOMICO_NUMERICO = 10000.0

    private val random: Random
        get() = Random()

    fun gerarValorRandomico(): Int {
        return 1 + random.nextInt(LIMITE_MAX_RANDOMICO_INTEIRO)
    }

    fun toStringGerarValorRandomicoIntAte(max: Int): String {
        return gerarValorRandomicoIntAte(max).toString()
    }

    fun gerarValorRandomicoIntAte(max: Int): Int {
        return 1 + random.nextInt(max)
    }

    fun gerarValorRandomicoLong(): Long {
        return gerarValorRandomico().toLong()
    }

    fun gerarValorRandomicoDoubleAte(limit: Double): Double {
        return Double.MIN_VALUE + random.nextDouble() * (limit - Double.MIN_VALUE)
    }

    fun gerarValorRandomicoDoubleAteCom(limit: Double, casasDecimais: Int): Double {
        return gerarValorRandomicoDoubleAte(limit).let { BigDecimal.valueOf(it).setScale(casasDecimais, RoundingMode.HALF_UP).toDouble() }
    }

    fun gerarValorRandomicoDecimalAte(limit: Double): BigDecimal? {
        return gerarValorRandomicoDoubleAte(limit).let { BigDecimal.valueOf(it).setScale(2, RoundingMode.HALF_UP) }
    }

    fun gerarValorRandomicoDecimal(): BigDecimal? {
        return gerarValorRandomicoDoubleAte(LIMITE_MAX_RANDOMICO_NUMERICO).let { BigDecimal.valueOf(it).setScale(2, RoundingMode.HALF_UP) }
    }
}
