package io.github.ricardoandradem.strategy;

import io.github.ricardoandradem.service.Servicefetch;

import java.util.ArrayList;

public interface FetchStrategy {
    public String getCotacao(ArrayList<Servicefetch> services);
}
