package estruturas_condicionais;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Digite um numero: ");
        int a = scanner.nextInt();

        if(a % 2 == 0 && a % 3 == 0){
            System.out.printf("O numero %d e divisivel por 2 e por 3!", a);
        }
        else{
            System.out.printf("O numero %d nao e divisivel por 2 e por 3!", a);
        }

        scanner.close();
    }
}