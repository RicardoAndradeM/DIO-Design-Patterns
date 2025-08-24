package io.github.ricardoandradem;

import io.github.ricardoandradem.service.CoinMarketCapService;
import io.github.ricardoandradem.service.CoingeckoService;
import io.github.ricardoandradem.service.GenimiService;
import io.github.ricardoandradem.service.Servicefetch;
import io.github.ricardoandradem.strategy.FetchStrategy;

import java.util.ArrayList;
import java.util.List;

public class Cotacao {
    private final ArrayList<Servicefetch> services;
    private FetchStrategy strategy;

    public Cotacao() {
        this.services = new ArrayList<>(List.of(
                CoingeckoService.getInstance(),
                CoinMarketCapService.getInstance(),
                GenimiService.getInstance()
        ));
        new ArrayList<>();
    }

    public void setStrategy(FetchStrategy strategy) {
        this.strategy = strategy;
    }

    public String getCotacao() {
        return this.strategy.getCotacao(services);
    }
}
