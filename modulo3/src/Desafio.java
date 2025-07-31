import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    /* Crie um programa que solicite ao usuário digitar um número.
        Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".*/



   /* Peça ao usuário para inserir dois números inteiros.
        Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.*/
//        System.out.println("Digite o primeiro número: ");
//        int inteiro1 = scan.nextInt();
//        System.out.println("Digite o segundo número: ");
//        int inteiro2 = scan.nextInt();
//
//
//        if (inteiro1 == inteiro2) {
//            System.out.println("São iguais");
//        } else if (inteiro1 > inteiro2) {
//            System.out.println("O primeiro número é maior que o segundo");
//        } else if (inteiro1 < inteiro2){
//            System.out.println("O segundo número é maior que o primeiro");
//        }



    /* Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
        Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/
// System.out.println("Escolha uma opçã: 1. Calcular área do quadrado, 2. Calcular área do círculo, 3.Encerrar");
//        double resposta = scan.nextInt();
//        double calculo = 0;
//        double calculo2 = 0;
//
//        if (resposta == 1) {
//            System.out.println("Digite o lado: ");
//            double ladoQuadrado = scan.nextInt();
//            calculo = ladoQuadrado * ladoQuadrado;
//            System.out.println(calculo);
//        } else if (resposta == 2){
//            System.out.println("Digite a área: ");
//            double raio = scan.nextInt();
//            calculo2 = 3.14 * raio * raio;
//        } else if (resposta == 3) {
//            System.out.println("Programa encerrado.");
//        } else {
//            System.out.println("Opção inválida. Tente novamente.");
//        }
//

        /* Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/


//        System.out.print("Digite um número: ");
//        int numero = scan.nextInt();
//
//        System.out.println("Tabuada do " + numero + ":");
//        for (int i = 1; i < 10; i++) {
//            System.out.println(numero + " x " + i + " = " + (numero * i));
//        }

    /* Crie um programa que solicite ao usuário a entrada de um número inteiro.
        Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.*/
//        System.out.println("Escreva um número: ");
//        int numeroUsuario = scan.nextInt();
//
//        if (numeroUsuario % 2 == 0) {
//            System.out.println("Este número é par");
//        } else {
//            System.out.println("Este número é ímpar");
//   }


        /* Crie um programa que solicite ao usuário um número e calcule o fatorial desse número. */
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}


