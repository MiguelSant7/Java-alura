import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    // metodo main
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Variáveis
        int numeroDeTentativas = 0;
        int numeroAleatorio = new Random().nextInt(100);
        int resposta = 0;

        while (resposta != numeroAleatorio) {
            System.out.println("Adivinhe um número entre 1 e 100: ");
            resposta = scan.nextInt();
            numeroDeTentativas += 1;

            if (resposta < numeroAleatorio) {
                System.out.println(String.format("O número %d é menor que o número secreto", resposta));
            } else if (resposta > numeroAleatorio) {
                System.out.println(String.format("O número %d é maior que o número secreto", resposta));
            }
        }
        System.out.println("Parabénsss!!!");
        System.out.printf("O Número de tentativas foi: %d", numeroDeTentativas);
    }

}
