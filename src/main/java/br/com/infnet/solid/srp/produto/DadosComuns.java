package br.com.infnet.solid.srp.produto;

import java.math.BigDecimal;

public class DadosComuns {
    private String nome;
    private String fabricante;
    private Categoria categoria;
    private BigDecimal preco;

    public DadosComuns(String nome, String fabricante, Categoria categoria, BigDecimal preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.categoria = categoria;
        this.preco = preco;
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
}
