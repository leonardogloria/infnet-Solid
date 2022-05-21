package br.com.infnet.solid.srp;

public class Runner {
    public static void main(String[] args) {
        Tenista tenista = new Tenista();
        tenista.setRanking(2L);
        tenista.reajustaPriceMoney(2_000_000.0);
        System.out.println(tenista.getPriceMoney());
    }
}
