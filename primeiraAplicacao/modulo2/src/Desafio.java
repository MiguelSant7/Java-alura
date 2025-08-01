public class Desafio {
    public static void main(String[] args) {
        // Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double note1 = 10.5;
        double note2 = 6.2;
        double average = (note1 + note2) / 2;

        int int_average = (int) average;
//        System.out.println(int_average);

        // Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double variable1 = 11.9;
        int variable2 = 8;

        int integerVariable1 = (int) variable1;

        //System.out.println(integerVariable1);
        //System.out.println(variable2)

        // Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'B';
        String palavra = "Letra: ";

        // System.out.println(palavra + letra);

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela
        //quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 100;
        int quantidade = 2;

        int integer_precoProduto = (int) precoProduto;
        int valorTotal = integer_precoProduto * quantidade;

        // System.out.printf("O valor total em produtos é de: %d%n", valorTotal);

        //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94
        //reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorEmDolares = 3;
        double realEmDolar = 4.94;

        double conversao = valorEmDolares * realEmDolar;

        // System.out.printf("O valor de %.1fU$ em reais é de %.1fR$", valorEmDolares, conversao);

        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida,
        //declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do
        //desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 100;
        double percentualDesconto = 0.10;

        double desconto = precoOriginal - (precoOriginal * percentualDesconto);

        System.out.printf("Parabéns!! Seu produto era %.1f Reais, porém com descontos ficou por %.2f Reais", precoOriginal, desconto);



    }
}
