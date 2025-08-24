package io.github.ricardoandradem.service;

public class GenimiService implements Servicefetch{

    private static final GenimiService GENIMI_SERVICE = new GenimiService();

    @Override
    public int getCotacao() {
        return 105045;
    }

    private GenimiService() {}

    public static GenimiService getInstance() {
        return GENIMI_SERVICE;
    }
}
