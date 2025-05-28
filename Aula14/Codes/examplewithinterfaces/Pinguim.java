package examplewithinterfaces;

public class Pinguim implements AveComedora{
    @Override
    public void comer() {
        System.out.println("O pinguim está comendo.");
    }

    // Pinguins não voam, então não implementamos a interface AveVoadora
}
    
