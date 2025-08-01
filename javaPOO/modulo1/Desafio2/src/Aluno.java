public class Aluno {

    // ATRIBUTOS
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;


    // METODOS

    // Getters
    //Pega nome do aluno
    public String getNome() {
        return nome;
    }

    //Pega nota 1 do aluno
    public double getNota1() {
        return nota1;
    }

    //Pega nota 2 do aluno
    public double getNota2() {
        return nota2;
    }

    //Pega nota 3 do aluno
    public double getNota3() {
        return nota3;
    }


    // Setters
    //Define nome do aluno
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Define nota 1 do aluno
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    //Define nota 2 do aluno
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    //Define nota 3 do aluno
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    // Calcula a média das 3 notas
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }



}
