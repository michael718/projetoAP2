package ap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados para o Carro
        System.out.println("Digite as informações do Carro:");
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine();

        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine();

        System.out.print("Ano: ");
        int anoCarro = scanner.nextInt();

        System.out.print("Número de Portas: ");
        int numeroPortas = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        // Instanciação do objeto Carro
        Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro, numeroPortas);

        // Entrada de dados para a Moto
        System.out.println("\nDigite as informações da Moto:");
        System.out.print("Marca: ");
        String marcaMoto = scanner.nextLine();

        System.out.print("Modelo: ");
        String modeloMoto = scanner.nextLine();

        System.out.print("Ano: ");
        int anoMoto = scanner.nextInt();

        System.out.print("Cilindrada (em cc): ");
        int cilindrada = scanner.nextInt();

        // Instanciação do objeto Moto
        Moto moto = new Moto(marcaMoto, modeloMoto, anoMoto, cilindrada);

        // Exibindo as informações dos veículos
        System.out.println("\nInformações do Carro:");
        System.out.println(carro.informacoesVeiculo());

        System.out.println("\nInformações da Moto:");
        System.out.println(moto.informacoesVeiculo());

        scanner.close();
    }
}


