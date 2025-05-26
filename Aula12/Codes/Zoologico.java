import java.util.List;

public class Zoologico {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex");
        Animal leao = new Leao("Simba");
        Animal gato = new Gato("Mi-mi");

        emitirSom(List.of(cachorro, leao, gato));   
    }

    public static void emitirSom(List<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal.getNome() + ": " + animal.emitirSom());
        }
        Math
    }

    

}
   
