package io.github.ricardoandradem.service;

public class CoinMarketCapService implements Servicefetch{

    private static final CoinMarketCapService COIN_MARKET_CAP_SERVICE = new CoinMarketCapService();

    @Override
    public int getCotacao() {
        return 114720;
    }

    private CoinMarketCapService() {}

    public static CoinMarketCapService getInstance() {
        return COIN_MARKET_CAP_SERVICE;
    }
}
