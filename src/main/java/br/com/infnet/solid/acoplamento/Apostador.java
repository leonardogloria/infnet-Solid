package br.com.infnet.solid.acoplamento;

import java.util.List;

public class Apostador {
    private String nome;
    private List<Vitoria> vitorias;

    public String getNome() {
        return nome;
    }

    public Double getPontosTotais(){
        Double total = this.getVitorias()
                .stream()
                .map(vitoria -> vitoria.getValor())
                .reduce(0D, Double::sum );
        return total;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Vitoria> getVitorias() {
        return vitorias;
    }
    public void setVitorias(List<Vitoria> vitorias) {
        this.vitorias = vitorias;
    }


}
