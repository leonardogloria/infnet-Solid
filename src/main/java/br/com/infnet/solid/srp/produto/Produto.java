package br.com.infnet.solid.srp.produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Date;

public class Produto {
    DadosComuns dadosComuns;
    private LocalDate ultimoReajuste;
    private Ranking ranking;

    public Produto(DadosComuns dadosComuns, LocalDate ultimoReajuste, Ranking ranking) {

        this.ultimoReajuste = ultimoReajuste;
        this.ranking = ranking;
    }

    public void reajustaPreco(BigDecimal novoPreco)  {
        this.dadosComuns.setPreco(novoPreco);
        this.ultimoReajuste = LocalDate.now();
    }


    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    public LocalDate getUltimoReajuste() {
        return ultimoReajuste;
    }

    public void setUltimoReajuste(LocalDate ultimoReajuste) {
        this.ultimoReajuste = ultimoReajuste;
    }

    public void promover(Ranking novoRanking) {
        this.setRanking(novoRanking);
    }
}
