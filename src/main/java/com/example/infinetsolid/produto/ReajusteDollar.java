package com.example.infinetsolid.produto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteDollar implements Reajuste {
    private BigDecimal valor;
    private LocalDate data;

    public ReajusteDollar(BigDecimal valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    @Override
    public BigDecimal valor() {
        return null;
    }

    @Override
    public LocalDate data() {
        return null;
    }

}
