package br.com.alura.carro;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void defineModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definePreco(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    private double calculaMaiorPreco(){
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }
        if (precoAno3 > precoAno2) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    private double calculaMenorPreco(){
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }if (precoAno3 < precoAno2) {
            menorPreco = precoAno3;
        }
        return menorPreco;
    }


    public void exibeInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço 1: " + precoAno1);
        System.out.println("Preço 2: " + precoAno2);
        System.out.println("Preço 3: " + precoAno3);
        System.out.println("Menor Preço: " + calculaMenorPreco());
        System.out.println("Maior Preço: " + calculaMaiorPreco());
    }


}



