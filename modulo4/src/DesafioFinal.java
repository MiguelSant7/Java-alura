import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nomeClinte = "Miguel Mouse";
        String tipoConta = "Corrente";
        double saldoDisponivel = 1500;
        int opcao = 0;


        System.out.println("---------------------");
        System.out.println("\nNome Do Cliente: " + nomeClinte);
        System.out.println("Tipo De Conta: " + tipoConta);
        System.out.println("Saldo Disponível: " + saldoDisponivel);
        System.out.println("\n---------------------");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;


        while (opcao != 4) {
            System.out.println(menu);
            System.out.print("Escolha sua opção: ");
            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.printf("O seu saldo atual é de: %.2f%n", saldoDisponivel);

            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir: ");
                double valorDesejado = scan.nextDouble();

                if (valorDesejado > saldoDisponivel) {
                    System.out.println("Não há saldo insuficiente");
                } else {
                    saldoDisponivel -= valorDesejado;
                    System.out.printf("Agora Restam: %.2fR$%n", saldoDisponivel);
                }

            } else if (opcao == 3) {
                System.out.println("Qual valor a receber: ");
                double valorAReceber = scan.nextDouble();
                if (valorAReceber < 0) {
                    System.out.println("Essa conta não é minha");
                } else {
                    saldoDisponivel += valorAReceber;
                    System.out.printf("Agora Restam: %.2fR$%n", saldoDisponivel);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}