package estruturas_sequenciais;
import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = scanner.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.printf("Antecessor: %d\n", antecessor);
        System.out.printf("Sucessor: %d\n", sucessor);

        scanner.close();
    }
}