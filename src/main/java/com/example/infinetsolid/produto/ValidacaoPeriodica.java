package com.example.infinetsolid.produto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodica implements Validacao {
    public void validar(Produto produto, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = produto.getUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if(mesesUltimoReajuste > 3){
            throw new ValidationException("Ultimo reajusete possui menos de 3 meses.");
        }
    }

}
