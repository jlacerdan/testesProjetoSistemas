package com.example.calculoicms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

public class GerenciadorDeVendasTest {

    @Test
    public void testarVendaSC() {
        GerenciadorDeVendas gdv = new GerenciadorDeVendas(new GerenciadorDeParametrosDefault());
        Venda venda = gdv.efetuarVenda(getUnidadeFederativa("SC"), new BigDecimal(100));
        assertEquals(venda.getAliquotaIcms(), BigDecimal.valueOf(7));
    }

    @Test
    public void testarVendaPR() {
        GerenciadorDeVendas gdv = new GerenciadorDeVendas(new GerenciadorDeParametrosDefault());
        Venda venda = gdv.efetuarVenda(getUnidadeFederativa("PR"), new BigDecimal(100));
        assertEquals(venda.getAliquotaIcms(), BigDecimal.valueOf(17));
    }

    @Test
    public void testarVendaSP() {
        GerenciadorDeVendas gdv = new GerenciadorDeVendas(new GerenciadorDeParametrosDefault());
        Venda venda = gdv.efetuarVenda(getUnidadeFederativa("SP"), new BigDecimal(100));
        assertEquals(venda.getAliquotaIcms(), BigDecimal.valueOf(12));
    }

    @Test
    public void testarVendaUfInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            GerenciadorDeVendas gdv = new GerenciadorDeVendas(new GerenciadorDeParametrosDefault());
            Venda venda = gdv.efetuarVenda(getUnidadeFederativa("BA"), new BigDecimal(100));
        });
    }

    private UnidadeFederativa getUnidadeFederativa(String sigla) {
        return new UnidadeFederativa(sigla);
    }
}
