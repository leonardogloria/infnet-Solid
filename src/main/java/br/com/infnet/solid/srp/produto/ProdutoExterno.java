package br.com.infnet.solid.srp.produto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoExterno{
    DadosComuns dadosComuns;
    private String loja;

    public DadosComuns getDadosComuns() {
        return dadosComuns;
    }

    public void setDadosComuns(DadosComuns dadosComuns) {
        this.dadosComuns = dadosComuns;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }
}
