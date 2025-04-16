import java.time.LocalDate;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
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