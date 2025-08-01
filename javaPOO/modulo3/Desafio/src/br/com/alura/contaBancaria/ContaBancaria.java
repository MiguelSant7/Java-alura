package br.com.alura.contaBancaria;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de: " + valor + "realizado." + "Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Transação inválida");
        } else {
            saldo -= valor;
            System.out.println("O valor de: " + valor + " Foi sacado da sua conta");
        }
    }

    public void consultarSaldo() {
        System.out.println("O seu saldo é de: " + saldo);
    }



}
