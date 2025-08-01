import java.util.Scanner;

public class Carro {

    String modelo;
    int anodocarro;
    String cor;
    Scanner scan = new Scanner(System.in);


    int calculaIdade() {
        return 2023 - anodocarro;
    }

    void ficaTecnicaAuto() {
        System.out.println(modelo);
        System.out.println(anodocarro);
        System.out.println(cor);
    }


}
