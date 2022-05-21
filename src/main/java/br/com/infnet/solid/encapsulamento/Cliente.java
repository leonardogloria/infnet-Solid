package br.com.infnet.solid.encapsulamento;

public class Cliente {
    private String nome;
    private Double saldo;

    public Cliente(String nome) {
        this.nome = nome;
        this.saldo = 0D;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void deposita(Double valor){
        if(valor > 1000){
            throw new IllegalArgumentException("Valor acima do permitido");
        }
        this.saldo = this.saldo += valor;
    }
    public void saca(Double valor){
        if(valor > 1000){
            throw new IllegalArgumentException("Valor acima do permitido");
        }
        this.saldo = this.saldo -= valor;
    }

}
