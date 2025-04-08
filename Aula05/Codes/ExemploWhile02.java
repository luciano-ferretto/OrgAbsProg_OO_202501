import java.util.Scanner;
public class ExemploWhile02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Neste exemplo a execução permanece em loop enquanto a variável opcao contiver o valor 'S' 
        * a grande diferença para a estrutura while tradicional é que a variável opcao não precisa
        * possuir o valor 'S' no início;
        */
        char opcao;
        do {
            System.out.println("Digite 'S' se deseja permanecer aqui?");
            opcao = scan.next().charAt(0);
        } while (opcao == 'S');
        scan.close();
    }
}
