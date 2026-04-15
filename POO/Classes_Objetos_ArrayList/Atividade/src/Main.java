import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> estoque = new ArrayList<>();

        estoque.add(new Produto("Notebook", 3500.00));
        estoque.add(new Produto("Celular", 2500.00));
        estoque.add(new Produto("Monitor", 900.00));
        estoque.add(new Produto("Teclado", 150.00));
        estoque.add(new Produto("Mouse", 80.00));

        // Lista original
        System.out.println("=== Lista Original ===");
        for (Produto p : estoque) {
            System.out.println(p.getNome() + " - R$" + p.getPreco());
        }

        // Ordenar por nome
        estoque.sort(Comparator.comparing(Produto::getNome).reversed());

        System.out.println("\n=== Ordenado por Nome ===");
        for (Produto p : estoque) {
            System.out.println(p.getNome() + " - R$" + p.getPreco());
        }

        // Ordenar por preço
        estoque.sort(Comparator.comparingDouble(Produto::getPreco).reversed());

        System.out.println("\n=== Ordenado por Preço ===");
        for (Produto p : estoque) {
            System.out.println(p.getNome() + " - R$" + p.getPreco());
        }

        // Filtro > 100
        System.out.println("\n=== Produtos acima de R$100 ===");
        for (Produto p : estoque) {
            if (p.getPreco() > 100) {
                System.out.println(p.getNome() + " - R$" + p.getPreco());
            }
        }

        // Busca
        String nomeBusca = "Celular";
        boolean encontrado = false;

        for (Produto p : estoque) {
            if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }

        System.out.println(encontrado ? "\nProduto encontrado!" : "\nProduto não encontrado!");

        // Remoção
        String remover = "Mouse";
        boolean removido = false;

        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).getNome().equalsIgnoreCase(remover)) {
                estoque.remove(i);
                removido = true;
                break;
            }
        }

        System.out.println(removido ? "Produto removido!" : "Produto não encontrado!");

        // Lista final
        System.out.println("\n=== Lista Final ===");
        for (Produto p : estoque) {
            System.out.println(p.getNome() + " - R$" + p.getPreco());
        }
    }
}