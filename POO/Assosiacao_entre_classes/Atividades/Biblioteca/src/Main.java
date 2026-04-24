public class Main {
    public static void main(String[] args) throws Exception {

        cliente c1 = new cliente("Carlos Silva", 25);
        livro l1 = new livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        emprestimo e1 = new emprestimo(c1, l1, "08/04/2026");

        System.out.println(e1.toString());

        cliente c2 = new cliente("Ana Pereira", 30);
        livro l2 = new livro("A revolução dos bichos", "George Orwell");
        emprestimo e2 = new emprestimo(c2, l2, "08/04/2025");

        System.out.println(e2.toString());

    }
}
