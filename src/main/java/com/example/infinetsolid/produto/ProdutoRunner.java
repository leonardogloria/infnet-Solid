package com.example.infinetsolid.produto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ProdutoRunner {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Geladeira");
        produto.setPreco(new BigDecimal("4000"));
        produto.setUltimoReajuste(LocalDate.now());

        List<Validacao> validacoes = Arrays.asList(new ValidacaoPercentual(), new ValidacaoPeriodica());
        ReajusteService reajusteService = new ReajusteService(validacoes);
        reajusteService.reajustaPreco(produto,new BigDecimal("6000"));
    }
}
