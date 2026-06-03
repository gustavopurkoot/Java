import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = { 10, 20, 30, 40, 50 };

        System.out.print("Digite uma posição: ");
        int posicao = scanner.nextInt();

        try {
            System.out.println("Valor armazenado: " + numeros[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: posição inexistente.");
        } finally {
            System.out.println("Consulta finalizada.");
            scanner.close();
        }
    }
}