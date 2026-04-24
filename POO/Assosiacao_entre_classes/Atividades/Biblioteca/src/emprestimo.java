public class emprestimo {
    private cliente cliente;
    private livro livro;
    private String dataEmprestimo;

    public emprestimo(cliente cliente, livro livro, String dataEmprestimo) {
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public String toString() {
        return  "\n ---\n\n" + "Dados do Empréstimo:\nCliente: " + cliente.getNome() + " (idade: " + cliente.getIdade() + ")\nLivro: " + livro.getTitulo() + " por " + livro.getAutor() + "\nData de Empréstimo: " + dataEmprestimo;
    }

}
