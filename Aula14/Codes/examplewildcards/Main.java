package examplewildcards;

import java.util.List;

public class Main {
    public static void imprimirNumeros(List<? extends Number> numeros) {
        for (Number numero : numeros) {
            System.out.println(numero + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> numerosInteiros = List.of(1, 2, 3, 4, 5);
        List<Double> numerosDecimais = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println("Números Inteiros:");
        imprimirNumeros(numerosInteiros);

        System.out.println("Números Decimais:");
        imprimirNumeros(numerosDecimais);

        List<String> numerosStrings = List.of("Um", "Dois", "Três");
        // A linha abaixo causaria um erro de compilação, pois String não é um Number
        // imprimirNumeros(numerosStrings); // Descomente para ver o erro de compilação
        System.out.println("Tentativa de imprimir Strings (não permitido):");
    }
}
