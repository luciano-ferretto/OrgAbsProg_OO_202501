import java.util.Random;

public class ExemploSwitch {
    public static void main(String[] args) {
        Random geradorAleatorio = new Random();
        int numero = geradorAleatorio.nextInt(101);
        
        switch (numero) {
            case 1:
                System.out.println("Número UM");
                break;
            case 2:
                System.out.println("Número DOIS");
                break;
            default:
                System.out.println("Número >= TRÊS");
                break;
        }
    }
}
