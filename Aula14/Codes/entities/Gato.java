package entities;
public class Gato {
    private String nome;
    private boolean dormindo;
    
    public Gato(String nome) {
        this.nome = nome;
        this.dormindo = false;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void colocarDormir() {
        this.dormindo = true;
    }
    
    public boolean estaDormindo() {
        return this.dormindo;
    }
    
}