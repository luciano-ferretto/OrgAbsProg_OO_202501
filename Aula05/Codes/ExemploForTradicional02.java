public class ExemploForTradicional02 {
    public static void main(String[] args) {
        /*Neste exemplo estamos declarando duas variáveis de controle que nomeamos de "i" e "j"
                   e as inicializamos com os valores 1 (um) e 10 (dez) respectivamente
          A cada iteração do bloco, ou seja, a cada loop haverá o incremento de "+ 1" (mais um)
                   na variável de controle "i" e um decremento de "- 1" (menos um) na variável
                   de controle "j"
          O loop ficará ativo enquanto a variável "i" for menor ou igual à "j",
                   ou seja, o loop será executado 5 (cinco) vezes
        */
        for (int i = 0, j = 10; i <= j; i++, j--) {
			System.out.println("Valores de i e j: " + i + " " + j);
       	}
    }
}
