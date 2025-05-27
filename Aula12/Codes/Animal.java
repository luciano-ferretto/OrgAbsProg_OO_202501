public abstract class Animal {
    private static int contador = 0;
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
        contador++;
    }

    public final String getNome() {
        return nome;
    }
    
    public abstract String emitirSom();

    public static int getContador() {
        return contador;
    }
    
}