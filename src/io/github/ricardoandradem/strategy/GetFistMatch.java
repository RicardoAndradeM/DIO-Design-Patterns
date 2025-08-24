package io.github.ricardoandradem.strategy;

import io.github.ricardoandradem.service.Servicefetch;

import java.util.ArrayList;

public class GetFistMatch implements FetchStrategy {
    @Override
    public String getCotacao(ArrayList<Servicefetch> services) {
        return Integer.toString(services.getFirst().getCotacao());
    }
}
