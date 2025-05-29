public class Gaivota extends Ave implements AveComedora, AveVoadora {

    @Override
    public void voar() {
        System.out.println("Gaivota voando");
    }

    @Override
    public void comer() {
        System.out.println("Gaivota comendo");
    }

}
