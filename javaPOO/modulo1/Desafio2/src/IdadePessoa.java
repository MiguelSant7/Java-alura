public class IdadePessoa {

    // ATRIBUTOS
    private String nome;
    private int idade;


    // METODOS

    public IdadePessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    //Setters
    //Metodo para definir o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Metodo para definir idade da pessoa
    public void setIdade(int idade) {
        if (idade > 0){
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }

    //getters
    //Metodo para pegar nome
    public String getNome() {
        return nome;
    }


    //Metodo para pegar idade
    public int getIdade() {
        return idade;
    }

    public void verificarIdade() {
        if (idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }


}
