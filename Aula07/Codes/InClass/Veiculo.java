import java.time.LocalDate;

class Veiculo {
    String marca;
    String modelo;
    int ano;
    String placa;

    Veiculo() {
        this.marca = "Marca não definida";
        this.modelo = "Modelo não definido";
        this.placa = "";
    }
    Veiculo (String marca) {
        this(marca, "modelo undefined");
    }

    Veiculo (String marca, String modelo) {
        this(marca, modelo, 0);
    }

    Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    Veiculo(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    Veiculo(String marca, String modelo, String placa, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    int calcularTempoUso() {
        int anoAtual = LocalDate.now().getYear();
        return this.calcularTempoUso(anoAtual);
    }

    int calcularTempoUso(int anoBase) {
        int tempoUso = anoBase - this.ano;
        return tempoUso;
    }
    

    Veiculo cloneMe() {
        Veiculo novo = new Veiculo();
        novo.marca = this.marca;
        novo.modelo = this.modelo;
        novo.ano = this.ano;
        novo.placa = this.placa;
        return novo;
    }
}