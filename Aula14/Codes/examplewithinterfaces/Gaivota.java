package examplewithinterfaces;

public class Gaivota implements AveComedora, AveVoadora {
    private String nome;

    public Gaivota(String nome) {
        this.nome = nome;
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando.");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public String getNome() {
        return nome;
    }
    
}
