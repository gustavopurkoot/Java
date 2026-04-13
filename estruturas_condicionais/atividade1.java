package estruturas_condicionais;
import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior, menor;
        
        System.out.print("Digite o primeiro valor: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int b = scanner.nextInt();
        
        if (a > b){
            maior = a;
            menor = b;
        }
        else{
            maior = b;
            menor = a;
        }
    
        System.out.printf("O maior numero e: %d e o menor e: %d", maior, menor);

        scanner.close();
    }

}
