package ap2;

public abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    // Construtor da classe Veiculo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método de acesso ao ano
    public int getAno() {
        return ano;
    }

    // Método para definir o ano
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método abstrato para obter informações do veículo
    public abstract String informacoesVeiculo();
}

