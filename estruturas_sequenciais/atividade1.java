package estruturas_sequenciais;
import java.util.Scanner;

class Exemplo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int horas, minutos, segundos, total;
    
    System.out.printf("Informe quantas horas: ");
    horas = scanner.nextInt();
    
    System.out.printf("Informe quantos minutos: ");
    minutos = scanner.nextInt();
    
    System.out.printf("Informe quantos segundos: ");
    segundos = scanner.nextInt();
    
    total = horas*3600 + minutos*60 + segundos;
    
    System.out.printf("total de segundos = %d", total);
    
    
    scanner.close();
    }
}