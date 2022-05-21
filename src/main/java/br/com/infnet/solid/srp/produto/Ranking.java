package br.com.infnet.solid.srp.produto;

public enum Ranking {
    SILVER{
        @Override
        public Ranking getProximoRanking() {
            return GOLD;
        }
    },GOLD{
        @Override
        public Ranking getProximoRanking() {
            return PLATINUM;
        }
    },PLATINUM{
        @Override
        public Ranking getProximoRanking() {
            return DIAMANT;
        }
    },DIAMANT{
        @Override
        public Ranking getProximoRanking() {
            return DIAMANT;
        }
    };

    public abstract Ranking getProximoRanking();

}
