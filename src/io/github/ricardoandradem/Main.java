package io.github.ricardoandradem;

public class Main {
    public static void main(String[] args) {
        FacadeCotacao facade = new FacadeCotacao();
        System.out.println(facade.getFistMatchCotacao());
        System.out.println(facade.getMeanValueCotacao());
    }
}