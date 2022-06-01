package com.example.infinetsolid.produto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoTerceirizado  {
    DadosProduto dadosProduto;
    private String lojaProprietaria;

    public DadosProduto getDadosProduto() {
        return dadosProduto;
    }

    public void setDadosProduto(DadosProduto dadosProduto) {
        this.dadosProduto = dadosProduto;
    }

    public String getLojaProprietaria() {
        return lojaProprietaria;
    }


    public void setLojaProprietaria(String lojaProprietaria) {
        this.lojaProprietaria = lojaProprietaria;
    }
}
