import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite sua nota da G1:");
        double notaG1 = lerTeclado.nextDouble();
        System.out.print("Digite sua nota da G2: ");
        double notaG2 = lerTeclado.nextDouble();

        String mensagem = notaG1 > notaG2 
            ? "Nota G1 maior que G2"
            : "Nota G2 maior ou igual que G1";
        System.out.println(mensagem);

        double media = (notaG1 + notaG2) / 2;

        System.out.printf("Sua média é: %.2f \n", media);

        String msg = switch((int) media) {
            case 7, 8, 9, 10 -> "Parabéns!!! Você foi aprovado.";
            case 3, 4, 5, 6 -> "Você está em exame";
            default -> "Não foi dessa vez";
        };

        System.out.println(msg);

        // Exemplo com IFs
        if (media >= 7) // Exemplo sem chaves
            System.out.println("Parabéns!!! Você foi aprovado.");
        else if (media >= 3)
            System.out.println("Você está em Exame!!!");
        else
            System.out.println("Não foi dessa vez!!!");

    }
}