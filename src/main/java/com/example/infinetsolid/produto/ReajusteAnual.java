package com.example.infinetsolid.produto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteAnual implements ReajusteTributavel{
    private BigDecimal valor;
    private LocalDate data;

    public ReajusteAnual(BigDecimal valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    @Override
    public BigDecimal valor() {
        return valor;
    }

    @Override
    public LocalDate data() {
        return data;
    }

    @Override
    public BigDecimal valorIpi() {
        return valor.multiply(new BigDecimal("0.3"));
    }
}
