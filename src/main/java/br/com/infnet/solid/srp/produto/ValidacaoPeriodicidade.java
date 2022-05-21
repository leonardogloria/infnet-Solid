package br.com.infnet.solid.srp.produto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPeriodicidade {
    public void valida(BigDecimal aumento, Produto produto) {
        BigDecimal percentualReajuste = aumento.divide(produto.getPreco(), RoundingMode.HALF_UP);
        if(percentualReajuste.compareTo(new BigDecimal("0.3")) > 0 ){
            throw  new ValidationException("Aumento não pode ser superior a 30%");
        }
    }
}
