import java.util.List;

public class AnimalUtils {

    private AnimalUtils(){
        
    }

     public static void emitirSons(List<Animal> animais){
        for (Animal animal : animais) {
            System.out.println("O animal " + animal.getNome() +
                     " faz " + animal.emitirSom());
        }
    }
}
