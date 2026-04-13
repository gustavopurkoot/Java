public class Main {
    public static void main(String[] args) throws Exception {
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro l2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        l1.exibirInfo();
        l2.exibirInfo();
    }
}
