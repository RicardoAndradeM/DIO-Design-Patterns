package io.github.ricardoandradem.service;

public class CoingeckoService implements Servicefetch{

    private static final CoingeckoService COINGECKO_SERVICE = new CoingeckoService();

    @Override
    public int getCotacao() {
        return 121956;
    }

    private CoingeckoService() {}

    public static CoingeckoService getInstance() {
        return COINGECKO_SERVICE;
    }
}
