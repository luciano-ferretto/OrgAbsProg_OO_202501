package br.com.yodacode.starwarsapp;

import br.com.yodacode.starwarsapp.armas.SabreDeLuz;

public class StarWarsDay {
    public static void main(String[] args) {
        System.out.println("May the 4th be with you!");
        SabreDeLuz sabreLuke = new SabreDeLuz("azul");
        sabreLuke.ativar();
    }
}

