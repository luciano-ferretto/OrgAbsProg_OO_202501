import java.util.List;

public class Zoologico {
    public static void main(String[] args) {
        System.out.println("Número de animais: " + Animal.getContador());

        

        Animal cachorro = new Cachorro("Rex");
        Animal leao = new Leao("Simba");
        Animal gatito = new Gato("Mia");

        //AnimalUtils utils = new AnimalUtils();
        AnimalUtils.emitirSons(List.of(cachorro, leao, gatito));

        System.out.println("Número de animais: " + Animal.getContador());

    }


   

}
