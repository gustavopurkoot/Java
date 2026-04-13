package estruturas_condicionais;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Digite um numero: ");
        int a = scanner.nextInt();

        if (a % 2 == 0){
            System.out.printf("O numero %d e divisivel por 2!", a);
        }
        if(a % 7 == 0){
            System.out.printf("O numero %d e divisivel por 7!", a);
        }
        if(a % 2 != 0 && a % 3 != 0){
            System.out.printf("O numero %d não e divisivel nem por 2 nem por 7!", a);
        }

        scanner.close();
    }
    
}
