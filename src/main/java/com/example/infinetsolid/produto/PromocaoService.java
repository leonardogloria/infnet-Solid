package com.example.infinetsolid.produto;

public class PromocaoService {
    public void promover(Produto produto, Boolean ratingBatido){
        if(produto.getCategoria().equals(Categoria.PLATINUM)){
            throw new ValidationException("Produtos Platinum não podem ser promovidos");
        }
        if(ratingBatido){
            produto.promover(produto.getCategoria().getProximaCategoria());
        }else {
            throw  new ValidationException("O Rating Não foi batido!");
        }
    }
}
