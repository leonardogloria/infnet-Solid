package br.com.infnet.solid.srp.produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Date;

public class Produto {
    private String nome;
    private String fabricante;
    private Categoria categoria;
    private BigDecimal preco;
    private LocalDate ultimoReajuste;

    public Produto(String nome, String fabricante, Categoria categoria, BigDecimal preco, LocalDate ultimoReajuste) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.categoria = categoria;
        this.preco = preco;
        this.ultimoReajuste = ultimoReajuste;
    }

    public void reajustaPreco(BigDecimal novoPreco) throws ValidationException {
        this.setPreco(novoPreco);
        this.ultimoReajuste = LocalDate.now();
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
