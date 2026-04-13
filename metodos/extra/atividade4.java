package metodos.extra;
import java.util.*;

public class atividade4 {

    public static void piramide(int n) {

        for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura da pirâmide: ");
        int n = scanner.nextInt();

        scanner.close();
        piramide(n);
    }
    
}
