package estruturas_condicionais;
import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menor;
        
        System.out.print("Digite o primeiro valor: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int c = scanner.nextInt();
        
        if (a < b && a < c){
            menor = a;
        }
        else if (b < a && b < c){
            menor = b;
        }
        else{
            menor = c;
        }
    
        System.out.printf("O menor numero e: %d", menor);

        scanner.close();
    }

}
