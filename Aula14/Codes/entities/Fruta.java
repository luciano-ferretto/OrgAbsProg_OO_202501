package entities;
public class Fruta {
    private String nome;
    private boolean cortada;

    public Fruta(String nome) {
        this.nome = nome;
        this.cortada = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void cortar() {
        this.cortada = true;
    }

    public boolean getCortada() {
        return this.cortada;
    }
    
}