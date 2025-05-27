public final class LivroFisico extends Livro {

    private int numeroExemplares;
    private String dimensoes;

    public LivroFisico(String titulo, String autor, int anoPublicacao, int numeroPaginas, int numeroExemplares, String dimensoes) {
        super(titulo, autor, anoPublicacao, numeroPaginas);
        this.numeroExemplares = numeroExemplares;
        this.dimensoes = dimensoes;
    }

    @Override // annotations
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

    @Override
    public String getTipoLivro() {
        return "Físico";
    }
}