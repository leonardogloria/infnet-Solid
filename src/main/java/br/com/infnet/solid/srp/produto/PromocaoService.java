package br.com.infnet.solid.srp.produto;

public class PromocaoService {
    public void promover(Produto produto, boolean vendasBatidas){
        Ranking rankingAtual = produto.getRanking();
        if(rankingAtual == Ranking.DIAMANT){
            throw new ValidationException("Produtos diamante não podem ser promovidos");
        }
        if(vendasBatidas){
            Ranking novoRanking = rankingAtual.getProximoRanking();
            produto.promover(novoRanking);
        } else {
            throw new ValidationException("Meta não batida");

        }

    }
}
