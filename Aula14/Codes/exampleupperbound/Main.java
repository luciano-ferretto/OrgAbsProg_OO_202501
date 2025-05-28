package exampleupperbound;

public class Main {
    public static void main(String[] args) {

        Caixa<Number> caixaInt = new Caixa<>();
        caixaInt.setValor(10);
        System.out.println("valor: " + caixaInt.getValor());
        System.out.println("Valor dobrado: " + caixaInt.doubleValor());
        // caixa.setValor("teste"); // Isso não compila, pois String não é um Number

        Caixa<Double> caixaDouble = new Caixa<>();
        caixaDouble.setValor(30.5);
        System.out.println("valor: " + caixaDouble.getValor());
        System.out.println("Valor dobrado: " + caixaDouble.doubleValor());
    }
}
