public class LivroFisico extends Livro {

    private int numeroExemplares;
    private String dimensoes;

    @Override //annotations
    public String toString() {
        String descricao = super.toString();
        descricao += " - Exemplares:" + getNumeroExemplares();
        return descricao;
    }

    public int getNumeroExemplares() {
        return numeroExemplares;
    }
    public void setNumeroExemplares(int numeroExemplares) {
        this.numeroExemplares = numeroExemplares;
    }
    public String getDimensoes() {
        return dimensoes;
    }
    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }
}
