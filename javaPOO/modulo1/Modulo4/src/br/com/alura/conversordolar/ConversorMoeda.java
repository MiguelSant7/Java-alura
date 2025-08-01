package br.com.alura.conversordolar;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double valorReal) {
        double cotacaoAtual = 5.74;
        double conversao =  valorReal * cotacaoAtual;
        System.out.println("O valor em reais é: R$" + conversao);
    }
}
