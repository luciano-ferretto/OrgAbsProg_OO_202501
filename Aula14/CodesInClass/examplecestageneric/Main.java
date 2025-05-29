package examplecestageneric;

import entities.Fruta;
import entities.FrutaCitrica;
import entities.Gato;

public class Main {
    public static void main(String[] args) {
        Cesta<Fruta> cestaFrutas = new Cesta<>(10);
        cestaFrutas.inserir(new Fruta("Maçã"));
        cestaFrutas.inserir(new Fruta("Pera"));
        cestaFrutas.inserir(new FrutaCitrica("Laranja"));


        fazerSaladaDeFrutas(cestaFrutas);

        Cesta<Gato> cestaGatitos = new Cesta<>(2);
        cestaGatitos.inserir(new Gato("Mimi"));
        cestaGatitos.inserir(new Gato("Miuki"));

        fazerSaladaDeFrutas(cestaGatitos);
    }

    public static Fruta[] fazerSaladaDeFrutas(Cesta<Fruta> cestaFrutas) {
        Fruta[] salada = new Fruta[20];
        int i = 0;
        while (cestaFrutas.exiteItens()) {
            Fruta fruta = cestaFrutas.getProximo();
            fruta.cortar();
            salada[i++] = fruta;
        }
        return salada;
    }
}
