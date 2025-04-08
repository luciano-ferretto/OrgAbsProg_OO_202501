public class ExemploForTradicional04 {
    public static void main(String[] args) {
        /*Neste exemplo NÃO temos nenhuma vairável de controle específica da estrutura do for,
                   temos na verdade uma variável "i" que foi declarada e iniciada
                   dentro do escopo do método main()
          Também não temos nenhum tipo de iteração (incremento) dentro da estrutura do for.
                   a variável que estamos utilizando na condição está sendo alterada no corpo de instruções
                   do for
          O loop ficará ativo enquanto a variável "i" for menor que 3 (três),
                   ou seja, o loop será executado 3 (três) vezes já que essa variável foi
                   iniciada em 0 (zero)
        */
        int i = 0;
		for (; i < 3;) {
			System.out.println("i: "+ i);
            i++;
       	}
    }
}


