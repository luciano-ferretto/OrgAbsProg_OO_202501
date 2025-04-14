import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        char opcao = 'S';
        while (opcao == 'S') {
            System.out.print("Para continuar digite S: ");
            opcao = lerTeclado.nextLine().charAt(0);
        }
    }
}