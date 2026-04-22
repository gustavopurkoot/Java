public class Livro extends ItemBiblioteca {

    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, int ano, String autor, int numeroPaginas) {
        super(titulo, ano);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Detalhes do livro:\n" +
                "Titulo: " + getTitulo() + "\n" +
                "Ano de publicacao: " + getAno() + "\n" +
                "Autor: " + autor + "\n" +
                "Numero de paginas: " + numeroPaginas + "\n" +
                "---";

    }
}