package br.com.dev.demos.kotlin.generals.design_patterns.strategy1.model

import java.math.BigDecimal

class Orcamento {
    private var valor: BigDecimal? = null

    fun getValor(): BigDecimal? {
        return valor
    }

    fun setValor(valor: BigDecimal?) {
        this.valor = valor;
    }
}
