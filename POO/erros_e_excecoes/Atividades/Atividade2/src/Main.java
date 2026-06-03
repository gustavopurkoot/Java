import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota;

        System.out.print("Digite uma nota: ");
        nota = scanner.nextFloat();

        try {
            validarNota(nota);
            System.out.print("Nota válida: " + nota);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void validarNota(float nota) {
        if (nota < 0) {
            throw new IllegalArgumentException("Erro: A nota não pode ser menor que 0");
        }
        if (nota > 10) {
            throw new IllegalArgumentException("Erro: A nota não pode ser maior que 10.");
        }
    }
}
