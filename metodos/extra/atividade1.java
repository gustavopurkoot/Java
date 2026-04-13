package metodos.extra;

import java.util.*;

public class atividade1 {

    public static void Produto(Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite o valor entregue: ");
        double valor_entregue = scanner.nextDouble();
        double troco = valor_entregue - preco;

         System.out.printf(
                "Você comprou um produto (%s) por R$ %s e entregou ao vendedor R$ %s em dinheiro. Você vai receber R$ %s de troco. Volte sempre!\n",
                nome, preco, valor_entregue, troco);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto(scanner);

        scanner.close();

    }

}
