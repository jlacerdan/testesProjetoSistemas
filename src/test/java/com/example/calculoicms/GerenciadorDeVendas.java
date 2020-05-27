package com.example.calculoicms;

import java.math.BigDecimal;

public class GerenciadorDeVendas {
    private GerenciadorDeParametros gdp;

    public GerenciadorDeVendas(GerenciadorDeParametros gdp) {
        this.gdp = gdp;
    }

    public Venda efetuarVenda(UnidadeFederativa ufDestino, BigDecimal valorDaVenda) {
        return new Venda(valorDaVenda, gdp.getPercentualICMS(ufDestino));
    }
}
