package com.example.infinetsolid.produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class ReajusteService {
    public void reajustaPreco(Produto produto, BigDecimal aumento){
        BigDecimal percentualAumento = produto.getPreco().divide(aumento, RoundingMode.HALF_UP);
        if(percentualAumento.compareTo(new BigDecimal("0.3")) > 0){
            throw new ValidationException("Aumento não pode ser maior que 30%");
        }
        BigDecimal novoPreco = produto.getPreco().add(aumento);
        produto.reajustaPreco(novoPreco);
    }
}
