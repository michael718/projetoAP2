package ap2;

public class Carro extends Veiculo {
    public int numeroPortas;  // Atributo adicional para Carro

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    // Implementação do método abstrato informacoesVeiculo
    @Override
    public String informacoesVeiculo() {
        return "Carro - Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + getAno() + ", Número de Portas: " + numeroPortas;
    }
}
