package br.com.infnet.solid.srp;

public class Tenista {
    private String nome;
    private String country;
    private Long ranking;
    private Double priceMoney = 0D;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getRanking() {
        return ranking;
    }

    public void setRanking(Long ranking) {
        this.ranking = ranking;
    }

    public Double getPriceMoney() {
        return priceMoney;
    }

    public void setPriceMoney(Double priceMoney) {
        this.priceMoney = priceMoney;
    }

    public void reajustaPriceMoney(Double price){
        double desconto = 0D;
        if(ranking <= 10){
            desconto =  (price * 0.06);

        }else if(ranking > 10 && ranking <= 100){
            desconto =  (price * 0.08);
        }else {
            desconto =  (price *  0.09);
        }
        System.out.println(desconto);
        double totalPrice = price - desconto;
        this.priceMoney += totalPrice;
    }
}
