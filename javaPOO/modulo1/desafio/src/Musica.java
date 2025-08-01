public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avaliaMusica(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes() {
        return somaDasAvaliacoes / numAvaliacoes;
    }


}
