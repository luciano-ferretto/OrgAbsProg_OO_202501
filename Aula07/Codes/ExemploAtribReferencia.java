public class ExemploAtribReferencia {
    public static void main(String[] args) {
        Veiculo uno = new Veiculo();
        uno.marca = "Fiat";
        uno.modelo = "Uno Mille";
        uno.ano = 2001;
        Veiculo novoUno = uno;
        uno.ano = 2014;
        System.out.println("O ano do uno é: " + uno.ano);
        System.out.println("O ano do novo uno é: " + novoUno.ano);
    }
}

