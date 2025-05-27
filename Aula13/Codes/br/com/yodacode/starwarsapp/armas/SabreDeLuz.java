package br.com.yodacode.starwarsapp.armas;

public class SabreDeLuz {
    private String cor;

    public SabreDeLuz(String cor) {
        this.cor = cor;
    }

    public void ativar() {
        System.out.println("Sabre de luz " + cor + " ativado! ⚡");
    }
}
