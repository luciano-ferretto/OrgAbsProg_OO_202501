public class ExemploForTradicional06 {
    public static void main(String[] args) {
        /*Neste exemplo o for possui uma variável de controle declarada com o nome "i"
         *      e iniciada com o valor 1 (um)
         * O loop será executado enquanto i for menor e igual à 5 (cinco)
         * A cada iteração, i será incrementado em "+ 1" (mais um)
         *      e a variável do método main() "sum" terá o seu valor corrente 
         *      acrescido pelo valor corrente da variável "i"
         *
         * O loop não possui instruções em seu corpo
         */
        int sum = 5;
		for (int i = 1; i <= 5; sum += ++i) ;
		System.out.println("O valor da variável sum é: " + sum);
    }
}

