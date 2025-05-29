package examplecestaobject;
import entities.Fruta;
import entities.FrutaCitrica;
import entities.Gato;

public class Main {
    public static void main(String[] args) {

        Cesta cestaFrutas = new Cesta(10);
        cestaFrutas.inserir(new Fruta("Maçã"));
        cestaFrutas.inserir(new Fruta("Pera"));
        cestaFrutas.inserir(new Fruta("laranja"));
        cestaFrutas.inserir(new FrutaCitrica("Limão"));

        cestaFrutas.inserir(new Gato("Paçoca"));

        fazerSaladaDeFrutas(cestaFrutas);

        Cesta cestaGatinhos = new Cesta(10);
        cestaGatinhos.inserir(new Gato("Paçoca"));
        cestaGatinhos.inserir(new Gato("Afonso"));

        fazerSaladaDeFrutas(cestaGatinhos);

        Cesta cestaFrutasCitricas = new Cesta(20);
        cestaFrutasCitricas.inserir(new FrutaCitrica("Limão"));
        fazerSaladaDeFrutas(cestaFrutasCitricas);

    }

    public static Fruta[] fazerSaladaDeFrutas(Cesta cestaFrutas) {
        Fruta[] salada = new Fruta[20];
        int i = 0;
        while (cestaFrutas.exiteItens()) {
            Fruta fruta = (Fruta) cestaFrutas.getProximo();
            fruta.cortar();
            salada[i++] = fruta;
        }
        return salada;
    }
}
