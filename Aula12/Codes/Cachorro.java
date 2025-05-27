public final class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override //não é obrigatória
    public String emitirSom() {
        return "Au, au";
    }
    
}
