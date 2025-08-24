package io.github.ricardoandradem.strategy;

import io.github.ricardoandradem.service.Servicefetch;

import java.util.ArrayList;

public class GetMeanValue implements FetchStrategy{
    @Override
    public String getCotacao(ArrayList<Servicefetch> services) {
        return Double.toString(
                (double) services.stream().map(Servicefetch::getCotacao).reduce(Integer::sum).get()
                        / services.size()
        );
    }
}
