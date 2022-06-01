package com.example.infinetsolid.produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Produto {
    private String nome;
    private String fabricante;
    private BigDecimal preco;
    private LocalDate ultimoReajuste;

    public void reajustaPreco(BigDecimal aumento){
        BigDecimal percentualAumento = preco.divide(aumento, RoundingMode.HALF_UP);
        if(percentualAumento.compareTo(new BigDecimal("0.3")) > 0){
            throw new ValidationException("Aumento não pode ser maior que 30%");
        }
        preco= preco.add(aumento);
        ultimoReajuste = LocalDate.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDate getUltimoReajuste() {
        return ultimoReajuste;
    }

    public void setUltimoReajuste(LocalDate ultimoReajuste) {
        this.ultimoReajuste = ultimoReajuste;
    }


}
