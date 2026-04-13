public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        setPreco(preco); // usando validação
        setQuantidade(quantidade); // usando validação
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade não pode ser negativa.");
        }
    }

    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Quantidade inválida para adicionar.");
        }
    }

    public void removerEstoque(int quantidade){
        if(quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade inválida para remover.");
        }
    }
}