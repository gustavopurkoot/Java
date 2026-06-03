import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Informe idade: ");
            int idade = scanner.nextInt();

            validarIdade(idade);
            System.out.println("Acesso liberado!");

            // System.out.println("Erro: " + e.getClass().getSimpleName());
            // System.out.println("Mensagem: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números inteiros!");
        } catch (IllegalArgumentException e) {
            System.out.println("Acesso negado.");
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa Encerrado.");
            scanner.close();
        }
    }

    public static void validarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("É necessário pelo menos 18 anos!");
        }
    }
}
