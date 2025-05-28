package exampleupperbound;
public class Caixa<T extends Number> {
    private T valor;

    public void setValor(T valor) {
        this.valor = valor;
    }   

    public T getValor() {
        return valor;
    }

    public double doubleValor() {
        return valor.doubleValue();
    }
    
}
