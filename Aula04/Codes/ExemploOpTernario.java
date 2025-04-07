import java.util.Scanner;

public class ExemploOpTernario {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = lerTeclado.nextInt();
        lerTeclado.nextLine(); //limpar buffer
        String tipoNumero = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(tipoNumero);
        //System.out.println((numero % 2 == 0) ? "Par" : "Ímpar");
    }   
}
