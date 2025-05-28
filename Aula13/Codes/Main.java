import java.util.List;

public class Main {
    public static void main(String[] args) {

        double teste = 0.1;
        double teste2 = 0.7;
        double teste3 = teste + teste2;
        System.out.println(teste3);


        LivroFisico livroFisico = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 1216, 5, "15x23 cm");
        // Upcasting LivroFisico para Livro
        // Isso é possível porque LivroFisico é uma subclasse de Livro
        Livro varLivro = livroFisico;

        // Upcasting LivroDigital para Livro
        Livro varLivro2 = new LivroDigital("1984", "George Orwell", 1949, 328, 1.5, "PDF");
        
        // Exibindo informações do livro físico
        System.out.println("Livro Físico:");
        System.out.println(varLivro.toString());
        System.out.println("Tipo: " + varLivro.getTipoLivro());
        System.out.println("Tempo de publicação: "
                + varLivro.calcularTempoPublicacao() + " anos\n");

        // Não é possível acessar diretamente atributos específicos de LivroFisico
        // System.out.println("Número de exemplares: "
        // + varLivro.getNumeroExemplares());

        exibirLivros(List.of(varLivro, varLivro2));
    }

    public static void exibirLivros(List<Livro> livros) {
        for (Livro livro : livros) {
            System.out.println(livro.toString());
            System.out.println("Tipo: " + livro.getTipoLivro());
            System.out.println("Tempo de publicação: "
                    + livro.calcularTempoPublicacao() + " anos\n");

            // Não é possível acessar diretamente atributos específicos de LivroFisico
            // System.out.println("Número de exemplares: "
            // + varLivro.getNumeroExemplares());

            // Então vou fazer o downcasting para acessar atributos específicos
            // LivroFisico livroFisico = (LivroFisico) livro;
            // System.out.println("Número de exemplares: "
            //        + livroFisico.getNumeroExemplares());
            // Isso pode causar ClassCastException se o livro não for do tipo LivroFisico

            // Se for necessário acessar atributos específicos,
            // é necessário fazer downcasting, mas isso deve ser feito com cuidado
            if (livro instanceof LivroFisico) { // Verifica se é um LivroFisico
                // Downcasting para LivroFisico - Cria uma variável temporária
                // do tipo LivroFisico para acessar atributos específicos
                LivroFisico livroFisicoTemp = (LivroFisico) livro;
                System.out.println("Número de exemplares: "
                        + livroFisicoTemp.getNumeroExemplares());
                System.out.println("Dimensões: "    
                        + livroFisicoTemp.getDimensoes());
            } else if (livro instanceof LivroDigital) {
                // Downcasting para LivroDigital - Sem criação de variável temporária
                System.out.println("Tamanho do arquivo: "
                        + ((LivroDigital) livro).getTamanhoArquivo() + " MB");
            }
        }
    }
}
