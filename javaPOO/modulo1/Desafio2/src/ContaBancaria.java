public class ContaBancaria {

    // ATRIBUTOS
    private int numeroConta;
    private double saldo;
    private String titular;


    // MÉTODOS

    //Pega o numero da conta setado
    public int getNumeroConta() {
        //Retorna esse nome
        return numeroConta;
    }

    //Pega o Saldo da conta
    public double getSaldo() {
        //Retorna esse saldo
        return saldo;
    }

    //Metodo para depositar valor para conta
    public void deposita(double valor) {
        //Lógica de deposito(Nega caso o valor a ser depositado seja menor que o saldo da sua conta)
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Transação Inválida");
        }
    }

    //Metodo para receber determinado valor(caso o valor a receber seja negativo(negativo=dívida), nega a trancação)
    public void recebe(double valor) {
        //Logica para receber valor
        if (valor > 0) {
            saldo += saldo;
        } else {
            System.out.println("Transação inválida");
        }
    }

    //Modifica o usuario
    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Exibe titular
    public String getTitular() {
        return titular;
    }
}
