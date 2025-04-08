public class ExemploForEach {
    public static void main(String[] args) {
        // Abaixo criamos um Array (vetor) de números inteiros (int)
        int[] numerosInteiros = {1, 3, 5, 7, 2, 4, 6, 8};   

        // Esta estrutura interage no vetor, jogando os números
        // para variável "num" em cada loop
        for (int num : numerosInteiros) {
            System.out.println("Número: " + num);
        }
    }
}


