import static java.lang.System.out;

public class Perfil {
    private String nome;

    public Perfil(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        Perfil perfil = new Perfil("Miguel");
        out.println("Tudo bem? " + perfil.getNome());

        int resultado = perfil.soma();
            out.println("O resultado da soma é: " + resultado);
    }

    private int soma() {
        return 10 - 5;
    }

}