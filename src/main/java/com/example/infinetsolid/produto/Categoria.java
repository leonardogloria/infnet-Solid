package com.example.infinetsolid.produto;

public enum Categoria {
    BRONZE{
        @Override
        public Categoria getProximaCategoria() {
            return Categoria.SILVER;
        }
    },
    SILVER {
        @Override
        public Categoria getProximaCategoria() {
            return Categoria.GOLD;
        }
    },
    GOLD{
        @Override
        public Categoria getProximaCategoria() {
            return Categoria.PLATINUM;
        }
    },
    PLATINUM{
        @Override
        public Categoria getProximaCategoria() {
            return Categoria.PLATINUM;
        }
    };

    public abstract Categoria getProximaCategoria();


}
