package metodos.extra;

import java.util.Scanner;

public class atividade2 {

    public static void Produto(Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        double desconto = preco * 0.10;

        System.out.printf("Você comprou um produto (%s) por R$ %.2f e acaba de ganhar um desconto de 10%%. Assim você vai pagar apenas R$ %.2f pelo seu produto. Volte sempre!", nome, preco, preco - desconto);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto(scanner);
        scanner.close();
    }
    
}
