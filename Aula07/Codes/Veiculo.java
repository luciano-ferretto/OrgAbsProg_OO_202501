// Abaixo temos um exemplo de uma classe 
// com o nome "Veiculo" e que possui 
// 4 (quatro) atributos
// Neste exemplo, esta classe não possui métodos

import java.time.LocalDate;

public class Veiculo { 
    // "class" identifica o início da classe
    // Atributos e métodos devem ficar entre as "chaves" {}
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    // Método Construtor Padrão
    Veiculo(){
        //Aqui invocamos o método construtor com os parâmetros
        this("Marca desconhecida", "Modelo desconhecido", 
                    LocalDate.now().getYear(), "");
    }
    // Método construtor recebendo parâmetros
    Veiculo(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    int calculaTempoUso() {
        int anoAtual = LocalDate.now().getYear();
        int tempoUso = calculaTempoUso(anoAtual);
        return tempoUso;
    }
    int calculaTempoUso(int anoBase) {
        int tempoUso = anoBase - this.ano;
        return tempoUso;
    }

    Veiculo cloneMe() {
        Veiculo veiculoDestino = new Veiculo();
        veiculoDestino.marca = this.marca;
        veiculoDestino.modelo = this.modelo;
        veiculoDestino.ano = this.ano;
        veiculoDestino.placa = this.placa;
        return veiculoDestino;
    }
    Veiculo cloneFromOther(Veiculo veiculoOrigem) {
        Veiculo veiculoDestino = new Veiculo();
        veiculoDestino.marca = veiculoOrigem.marca;
        veiculoDestino.modelo = veiculoOrigem.modelo;
        veiculoDestino.ano = veiculoOrigem.ano;
        veiculoDestino.placa = veiculoOrigem.placa;
        return veiculoDestino;
    }
    Veiculo cloneFromOtherWrong(Veiculo veiculoOrigem) {
        Veiculo veiculoDestino = veiculoOrigem;
        return veiculoDestino;
    }
}



