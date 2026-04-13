package metodos.extra;

import java.util.Scanner;

public class atividade3 {

    public static void media(double[] nota, String caractere) {
        double media = 0;
        switch (caractere) {
            case "A":
                for (int i = 0; i < nota.length; i++) {
                    media += nota[i];
                }
                media /= nota.length;
                break;
            case "P":
                media = (nota[0] * 5 + nota[1] * 3 + nota[2] * 2) / 10;
                break;
            default:
                System.out.println("Caractere Inválido");
                return;
        }

        System.out.printf("A média é: %.2f%n", media);
    }

    public static void main(String[] args) {
        double[] nota = new double[3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite A para média aritmética ou P para média ponderada: ");
        String caractere = scanner.nextLine();
        caractere = caractere.toUpperCase();
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a nota %d: ", i + 1);
            nota[i] = scanner.nextDouble();
        }

        media(nota, caractere);

        scanner.close();

    }
}
