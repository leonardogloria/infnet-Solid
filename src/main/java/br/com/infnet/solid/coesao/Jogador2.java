package br.com.infnet.solid.coesao;

import java.math.BigDecimal;

public class Jogador2 {
    private String nome;
    private String nickname;
    private ClasseJogador classe;
    private BigDecimal score;
    private String credicardNumber;
    private String credicardTitular;
    private String credicardExpDate;
    private String credicardCode;

    public Boolean isPlatinumPlayer() {
        boolean isPlatinum = false;
        if (this.classe.equals(ClasseJogador.PLATINUM)) isPlatinum = true;
        return isPlatinum;
    }

    public String formataScore(){
        return "";
    }
    public String formataScoreComDuasCasasDecimais(){
        return "";
    }
    public String formataScoreParaPadraoUSA(){
        return "";
    }

}
