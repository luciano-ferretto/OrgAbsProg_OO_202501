public class Animal {

    private String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }   

    public String emitirSom() {
        return "Som de animal";
    }
}