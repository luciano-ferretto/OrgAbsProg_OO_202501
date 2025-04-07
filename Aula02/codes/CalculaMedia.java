import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        char exemploChar = 'd';
        
        //Declaração de uma variável do tipo int
        // e atribuição do valor
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite seu RA: ");
        int ra = lerTeclado.nextInt();
        lerTeclado.nextLine(); //para limpar buffer teclado

        System.out.println("Digite seu nome: ");
        String nome = lerTeclado.nextLine();

        System.out.println("Digite a nota G1: ");
        double g1 = lerTeclado.nextDouble();
        lerTeclado.nextLine(); //para limpar buffer teclado
        System.out.println("Digite a nota G2: ");
        double g2 = lerTeclado.nextDouble();
        lerTeclado.nextLine(); //para limpar buffer teclado

        System.out.println("Existe ponto extra: (true/false)");
        boolean pontoExtra = lerTeclado.nextBoolean();
        lerTeclado.nextLine(); //para limpar buffer teclado

        double media = calcularMediaAritimetica(g1, g2);
        // Se o pontoExtra for True -> somar 1
        //      if (pontoExtra == false)
        //      if (!pontoExtra)
        //      if (pontoExtra == true)
        if (pontoExtra) {
            media++;
        }
        if (ra % 2 == 0) {
            System.out.println("RA é um número par");
        }
        imprimirMedia(media);
    }
    static double calcularMediaAritimetica(double nota1, double nota2){
        double retorno = (nota1 + nota2) / 2;
        return retorno;
    }
    static void imprimirMedia(double media) {
        System.out.println("A média é: " + media);
    }
}