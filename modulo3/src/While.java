import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        // Input
        Scanner scan = new Scanner(System.in);

        // Variaveis
        System.out.println("Digite a quantidade de notas: ");
        int quantidadeNotas = 0;
        double nota = 0;
        double media = 0;


        while (nota != -1) {
            System.out.println("Digite as notas: ");
            nota = scan.nextDouble();

            if (quantidadeNotas != 0) {
                if (nota != -1) {
                    media += nota;
                    quantidadeNotas++;
                } else {
                    break;
                }
            } else {
                System.out.println("O resultado é 0");
            }

        }

        double mediaFinal = media/quantidadeNotas;

        System.out.println("Média: " + mediaFinal);
    }

}


