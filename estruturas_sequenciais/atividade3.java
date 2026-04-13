package estruturas_sequenciais;
import java.util.Scanner;

class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lata, garrafa_600, garrafa_2000;
        double total;

        System.out.print("Informe quantas latas de 350ml: ");
        lata = scanner.nextInt();

        System.out.print("Informe quantas garrafas de 600ml: ");
        garrafa_600 = scanner.nextInt();

        System.out.print("Informe quantas garrafas de 2 litros: ");
        garrafa_2000 = scanner.nextInt();

        // Convertendo tudo para ml
        int totalMl = (lata * 350) +
                      (garrafa_600 * 600) +
                      (garrafa_2000 * 2000);

        // Convertendo para litros
        total = totalMl / 1000.0;

        System.out.printf("Total de litros comprados = %.2f L\n", total);

        scanner.close();
    }
}