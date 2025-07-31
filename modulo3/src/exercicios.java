import javax.swing.*;
import java.util.Scanner;

public class exercicios {

    public static void main(String[] args) {
//        int anoDeLancamento = 2022;
//        boolean incluidoNoPlano = true;
//        double notaDoFilme = 8.1;
//        String tipoDePlano = "Plus";
//        int diaDaSemana = 1;
//        String nomeDia = "";

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        String  nomeDoFilme = leitura.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite a avaliação: ");
        double nota = leitura.nextDouble();


        System.out.println(nomeDoFilme);
        System.out.println(anoDeLancamento);
        System.out.println(nota);


//        switch (diaDaSemana) {
//            case 1:
//                nomeDia = "Domingo";
//                break;
//            case 2:
//                nomeDia = "Segunda";
//                break;
//            case 3:
//                nomeDia = "Terça";
//                break;
//            case 4:
//                nomeDia = "Quarta";
//                break;
//            case 5:
//                nomeDia = "Quinta";
//                break;
//            case 6:
//                nomeDia = "Sexta";
//                break;
//            case 7:
//                nomeDia = "Sabado";
//                break;
//            default:
//                System.out.println("Dia inválido");
//                break;
//        }





//        if (anoDeLancamento >= 2022) {
//            System.out.println("Filme de lançamento");
//        } else{
//            System.out.println("Filme antigo");
//        }
//
//        if (incluidoNoPlano == true || tipoDePlano.equals("Plus")) {
//            System.out.println("Liberado");
//        } else {
//            System.out.println("Negado");
//        }


    }
}