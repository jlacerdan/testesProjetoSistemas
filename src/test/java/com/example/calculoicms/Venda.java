package com.example.calculoicms;

import java.math.BigDecimal;

public class Venda {
    private BigDecimal valorDaVenda;
    private BigDecimal aliquotaIcms;

    public Venda(BigDecimal valorDaVenda, BigDecimal aliquotaIcms) {
        this.valorDaVenda = valorDaVenda;
        this.aliquotaIcms = aliquotaIcms;
    }

    public BigDecimal getValorDaVenda() {
        return valorDaVenda;
    }

    public BigDecimal getAliquotaIcms() {
        return aliquotaIcms;
    }
}
