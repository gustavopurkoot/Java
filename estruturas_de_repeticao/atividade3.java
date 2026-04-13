package estruturas_de_repeticao;
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        System.out.println("Os numeros pares deste numero são:");
        for(int i = 1; i <= numero; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        scanner.close();
    }
    
}
