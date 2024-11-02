Sistema de Gerenciamento de Veículos

Projeto em Java para gerenciamento de veículos, aplicando conceitos de Orientação a Objetos: herança, encapsulamento e classes abstratas.

Estrutura do Projeto
Veiculo.java: Classe abstrata base com atributos marca, modelo, ano e métodos getAno(), setAno(), e informacoesVeiculo().
Carro.java: Subclasse de Veiculo com atributo adicional numeroPortas.
Moto.java: Subclasse de Veiculo com atributo adicional cilindrada.
Main.java: Classe principal que permite entrada de dados dos veículos e exibe suas informações.

Como Executar

1. Compile os arquivos:
   javac Veiculo.java Carro.java Moto.java Main.java

2. Execute o programa
   java Main

O programa pedirá os dados dos veículos e exibirá as informações completas.
