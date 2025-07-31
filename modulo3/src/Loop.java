import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Scanenr
        Scanner scan = new Scanner(System.in);

        // Variaveis
        System.out.println("Digite a quantidade de notas: ");
        int quantidadeNotas = scan.nextInt();
        double notas = 0;
        double media = 0;


        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("Digite as notas: ");
            notas = scan.nextDouble();
            media += notas;

        }

        double mediaFinal = media/quantidadeNotas;

        System.out.println("Média: " + mediaFinal);
    }


}
