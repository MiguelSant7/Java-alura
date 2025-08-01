public class Livro {

    // ATRIBUTOS
    private String titulo;
    private String autor;

    // METODOS
    // Metodo Get & Set Autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Metodo Get & Set Titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

}
