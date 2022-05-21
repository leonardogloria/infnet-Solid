package br.com.infnet.solid.srp.produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ReajusteService {
    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustaPreco(BigDecimal aumento, Produto produto) throws ValidationException  {
        this.validacoes.forEach(v -> {
            try {
                v.valida(aumento,produto);
            } catch (ValidationException e) {
                e.printStackTrace();
            }
        });
        BigDecimal novoPreco = produto.getPreco().add(aumento);
        produto.reajustaPreco(novoPreco);
    }
}
