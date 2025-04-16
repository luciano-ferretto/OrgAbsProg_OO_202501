import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Veiculo unoDeFirma =  new Veiculo("Fiat", "Uno com escada", 2002, "ABC-6666");

        new Veiculo("Fiat", "uno", 95, "placa");

        Veiculo cerato = new Veiculo();
        cerato.setMarca("Kia");
        cerato.setModelo("Cerato");
        cerato.setAno(2011);;
        cerato.setPlaca("ABC-1234");

        cerato.calcularTempoUso();
        cerato.calcularTempoUso(2030);

        Veiculo novoCerato = cerato.cloneMe();
        Veiculo novoCerato2 = cerato.cloneMe();


        novoCerato.ano = 2020;

        System.out.println(cerato.getAno());
        System.out.println(novoCerato.getAno());
        
        
        cerato.ano = 2011;

        // qual o ano do cerato? 2011
        // qual o ano do novoCerato? 2011


        Veiculo carroAugusto = new Veiculo();
        carroAugusto.marca = "Chevrolet";
        carroAugusto.modelo = "Celta";
        carroAugusto.ano = 2006;
        carroAugusto.placa = "DEF-5678";

        System.out.println("O meu carro é " 
                + cerato.marca 
                + " - " + cerato.modelo
                + " - " + cerato.ano);

        int anoAtual = LocalDate.now().getYear();

        int tempoUsoCerato = cerato.calcularTempoUso(anoAtual);
        System.out.println("Tempo de uso: " + tempoUsoCerato);

        System.out.println("O carro do Augusto é " 
                + carroAugusto.marca 
                + " - " + carroAugusto.modelo
                + " - " + carroAugusto.ano);
                
        System.out.println("Tempo de uso: " + carroAugusto.calcularTempoUso(anoAtual));
    }
}
