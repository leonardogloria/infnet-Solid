package com.example.infinetsolid.produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Produto {
    public DadosProduto getDadosProduto() {
        return dadosProduto;
    }

    public void setDadosProduto(DadosProduto dadosProduto) {
        this.dadosProduto = dadosProduto;
    }

    private DadosProduto dadosProduto;
    private LocalDate ultimoReajuste;

    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void reajustaPreco(BigDecimal novoPreco){
       this.dadosProduto.setPreco(novoPreco);
       this.ultimoReajuste = LocalDate.now();
    }
    public void promover(Categoria novaCategoria){
        this.categoria = novaCategoria;
    }




    public LocalDate getUltimoReajuste() {
        return ultimoReajuste;
    }

    public void setUltimoReajuste(LocalDate ultimoReajuste) {
        this.ultimoReajuste = ultimoReajuste;
    }


}
