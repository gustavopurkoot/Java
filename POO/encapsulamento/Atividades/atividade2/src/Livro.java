public class Livro {
    private String Titulo;
    private String Autor;
    private int Ano;

    public Livro(String titulo, String autor, int ano) {
        Titulo = titulo;
        Autor = autor;
        Ano = ano;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    
    public void exibirInfo(){
        System.out.println("-------------------------------------");
        System.out.println("Título: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Ano: " + Ano);
    }
}
