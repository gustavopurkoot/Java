public class Biblioteca {
    public static void main(String[] args) throws Exception {

        livro livro1 = new livro();
        livro1.titulo = "O Senhor dos Anéis";
        livro1.ano = 1954;
        livro1.exibirinfo();

        livro livro2 = new livro();
        livro2.titulo = "Harry Potter e a Pedra Filosofal";
        livro2.ano = 1997;
        livro2.exibirinfo();  
        
    }
}
