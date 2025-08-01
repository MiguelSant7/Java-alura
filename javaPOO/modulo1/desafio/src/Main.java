class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Calculadora calculo = new Calculadora();
        Musica minhaMusica = new Musica();
        Carro meuCarro = new Carro();

        meuCarro.modelo = "Opala Diplomata";
        meuCarro.cor = "Preto";
        meuCarro.anodocarro = 1970;


        meuCarro.ficaTecnicaAuto();
        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");


//        minhaMusica.titulo = "Cartas";
//        minhaMusica.artista = "VND";
//        minhaMusica.anoDeLancamento = 2022;
//
//        minhaMusica.avaliaMusica(8);
//        minhaMusica.avaliaMusica(9);
//        minhaMusica.avaliaMusica(7);
//
//        minhaMusica.exibeFichaTecnica();
//
//        System.out.println(minhaMusica.titulo);
//        System.out.println(minhaMusica.artista);
//        System.out.println(minhaMusica.anoDeLancamento);
//
//        double media = minhaMusica.mediaAvaliacoes();
//        System.out.println("Média das avaliações: " + media);

    }
}
