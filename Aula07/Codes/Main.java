import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Veiculo uno = new Veiculo();
        uno.marca = "Fiat";
        uno.modelo = "Uno Mille";
        uno.ano = 1998;
        uno.placa = "ABC-1234";

        Veiculo fusca = new Veiculo("Volkswagem", "Fusca - Série Ouro", 1995, "DEF=5678");
        
        Veiculo outroFusca = fusca.cloneMe();

        //LocalDate dataAtual = LocalDate.now();
        //int anoAtual = dataAtual.getYear();
        int anoBase = LocalDate.now().getYear();
        int tempoUsoUno = uno.calcularTempoUso(anoBase);
        System.out.println("O tempo de uso do Uno é: " 
                                + tempoUsoUno);

        System.out.println(
            "O tempo de uso do Fusca é: " 
                + fusca.calcularTempoUso());
        System.out.println(
            "O tempo de uso do Fusca em 2030 será: " 
                + fusca.calcularTempoUso(2030));
    }
}


