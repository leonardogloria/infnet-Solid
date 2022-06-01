package com.example.infinetsolid.produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ReajusteService {
    private List<Validacao> validacoes;

    public ReajusteService(List<Validacao> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustaPreco(Produto produto, BigDecimal aumento){
        this.validacoes.forEach(validacao -> validacao.validar(produto,aumento));
        BigDecimal novoPreco = produto.getPreco().add(aumento);
        produto.reajustaPreco(novoPreco);
    }
}
