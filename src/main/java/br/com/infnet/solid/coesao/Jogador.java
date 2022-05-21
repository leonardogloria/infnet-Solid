package br.com.infnet.solid.coesao;

import java.math.BigDecimal;

public class Jogador {
    private String nome;
    private String nickname;
    private ClasseJogador classe;
    private BigDecimal score;

    public Boolean isPlatinumPlayer(){
        boolean isPlatinum = false;
        if(this.classe.equals(ClasseJogador.PLATINUM)) isPlatinum = true;
        return isPlatinum;
    }
}
