package com.example.infinetsolid.produto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentual implements Validacao {
    public void validar(Produto produto, BigDecimal aumento) {
        BigDecimal percentualAumento = produto.getPreco().divide(aumento);
        System.out.println(percentualAumento);
        if(percentualAumento.compareTo(new BigDecimal("0.3")) > 0){
            throw new ValidationException("Aumento não pode ser maior que 30%");
        }
    }
}
