package com.example.calculoicms;

import java.math.BigDecimal;

public class GerenciadorDeParametrosDefault implements GerenciadorDeParametros {
    private BigDecimal aliquotaIcms;

    public BigDecimal getPercentualICMS(UnidadeFederativa uf) {
        if (uf.getSigla() == "SP") {
            return new BigDecimal(12.0);
        }
        if (uf.getSigla() == "PR") {
            return new BigDecimal(17.0);
        }
        if (uf.getSigla() == "SC") {
            return new BigDecimal(7.0);
        } else {
            throw new IllegalArgumentException("UF inválido!");
        }
    }

    public BigDecimal getAliquotaIcms() {
        return aliquotaIcms;
    }
}
