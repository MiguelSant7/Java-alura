package br.com.alura.minhasmusicas.modelos;

// Superclasse Audio(Referencia Podcast % Musicas)
public class Audio {
    // Atributos
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    // Métodos getter e setter para titulo pois poderá ser módificado
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos getter para o totalCurtidas, classificacao e TotalReproducoes
    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    // Métodos vazios para curtir e reproduzir
    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }
}
