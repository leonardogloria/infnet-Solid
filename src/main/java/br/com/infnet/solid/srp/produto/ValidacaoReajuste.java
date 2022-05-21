package br.com.infnet.solid.srp.produto;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
     void valida(BigDecimal aumento, Produto produto);
}
