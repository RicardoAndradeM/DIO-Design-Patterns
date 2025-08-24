package io.github.ricardoandradem;

import io.github.ricardoandradem.strategy.GetFistMatch;
import io.github.ricardoandradem.strategy.GetMeanValue;

public class FacadeCotacao {
    private final Cotacao cotacao;
    private final GetFistMatch getFistMatch;
    private final GetMeanValue getMeanValue;

    public FacadeCotacao() {
        this.cotacao = new Cotacao();
        this.getFistMatch = new GetFistMatch();
        this.getMeanValue = new GetMeanValue();
    }

    public String getFistMatchCotacao() {
        this.cotacao.setStrategy(getFistMatch);
        return cotacao.getCotacao();
    }

    public String getMeanValueCotacao() {
        this.cotacao.setStrategy(getMeanValue);
        return cotacao.getCotacao();
    }
}
