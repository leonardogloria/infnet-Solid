package br.com.infnet.solid.srp.produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class ReajusteService {
    public void reajustaPreco(BigDecimal aumento, Produto produto) throws ValidationException {
        BigDecimal percentualReajuste = aumento.divide(produto.getPreco(), RoundingMode.HALF_UP);
        if(percentualReajuste.compareTo(new BigDecimal("0.3")) > 0 ){
            throw  new ValidationException("Aumento não pode ser superior a 30%");
        }
        BigDecimal novoPreco = produto.getPreco().add(aumento);
        produto.reajustaPreco(novoPreco);
    }
}
