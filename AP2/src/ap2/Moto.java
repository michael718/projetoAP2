package ap2;

public class Moto extends Veiculo {
    private int cilindrada;  // Atributo adicional privado para Moto

    // Construtor da classe Moto
    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    // Implementação do método abstrato informacoesVeiculo
    @Override
    public String informacoesVeiculo() {
        return "Moto - Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + getAno() + ", Cilindrada: " + cilindrada + " cc";
    }
}

