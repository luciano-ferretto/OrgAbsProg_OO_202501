package examplewithoutinterfaces;

public class Pinguim extends Ave {

    @Override
    public void voar() {
        throw new UnsupportedOperationException("Pinguins não voam!");
    }

    @Override
    public void comer() {
        System.out.println("Pinguim come peixe!");
    }
    
}
