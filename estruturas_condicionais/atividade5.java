package estruturas_condicionais;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("total de copias: ");
        int total_copias = scanner.nextInt();

        if (total_copias <= 100){
            System.out.printf("O valor total foi de R$:%.2f", total_copias * 0.25);
        }
        else {
            System.out.printf("O valor total foi de R$:%.2f", total_copias * .20);
        }

        scanner.close();
    }
}
