public class Produto {

    // ATRIBUTOS
    private String nome;
    private int preco;

    // METODOS

    // Gatters
    //Pega nome do produto
    public String getNome() {
        return nome;
    }

    //Pega preco do produto
    public int getPreco() {
        return preco;
    }


    // Setters
    //Define nome do produto
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Define preço do produto
    public void setPreco(int preco) {
        this.preco = preco;
    }


    public void aplicarDesconto(double valorPercentual) {
        valorPercentual = valorPercentual / 100;

        if (valorPercentual != 0) {
            double precoFinal = preco - (preco * valorPercentual);
            System.out.printf("O preço final do produto é: %.2f%n", precoFinal);
        } else {
            System.out.println("Valor inválido");
        }
    }
}
