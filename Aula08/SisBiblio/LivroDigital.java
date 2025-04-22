public class LivroDigital extends Livro {
    
    private double tamanhoArquivo;
    private String formatoArquivo;

    @Override //annotations
    public String toString() {
        String descricao = super.toString();
        descricao += " - Formato:" + getFormatoArquivo();
        return descricao;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }
    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
    public String getFormatoArquivo() {
        return formatoArquivo;
    }
    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }

    
}
