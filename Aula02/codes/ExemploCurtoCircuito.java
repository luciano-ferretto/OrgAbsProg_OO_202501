public class ExemploCurtoCircuito {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 0;
        if (numero2 > 0 && numero1 % numero2 == 0) {
            System.out.println(numero1 + " é fator de " + numero2);
        }
    }
}
