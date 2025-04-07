import java.util.Scanner;

public class ExemploIf {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite a nota G1:");
        double notaG1 = lerTeclado.nextDouble();
        lerTeclado.nextLine(); // Limpar buffer
        System.out.println("Digite a nota G2:");
        double notaG2 = lerTeclado.nextDouble();
        lerTeclado.nextLine(); // Limpar buffer
        double media = (notaG1 + notaG2) / 2;
        
        System.out.printf("Sua média final é: %.2f \n", media);
        if (media >= 7)
            System.out.println("PARABÉNS!!! Você está aprovado!");
        else if (media >= 3)
            System.out.println("Você está em Exame");
        else
            System.out.println("Infelizmente não foi dessa vez!");

    }

}