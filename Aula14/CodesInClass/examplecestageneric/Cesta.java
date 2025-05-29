package examplecestageneric;

public class Cesta<E> {
    private E[] itens;
    private int tamanhoAtual = 0;

    public Cesta(int tamanho) {
        itens = (E[]) new Object[tamanho];
    }

    public void inserir(E item) {
        if (tamanhoAtual < itens.length) {
            itens[tamanhoAtual++] = item; // LEMBREM-SE: o operador ++ é pós-fixado, ou seja, ele incrementa a variável
                                          // após a atribuição
        } else {
            System.out.println("Cesta cheia! Não é possível adicionar mais itens.");
        }
    }

    public E getProximo() {
        if (tamanhoAtual > 0) {
            E item = itens[--tamanhoAtual]; // LEMBREM-SE: o operador -- é pré-fixado, ou seja, ele decrementa a
                                                 // variável antes da atribuição
            itens[tamanhoAtual] = null; // Remove referência para permitir garbage collection
            return item;
        } else {
            System.out.println("Não há mais itens na cesta.");
            return null;
        }
    }

    // Método para verificar se existem itens na cesta
    public boolean exiteItens() {
        return tamanhoAtual > 0;
    }
}
