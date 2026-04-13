package estruturas_sequenciais;
import java.util.Scanner;

class Atividad_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float capacidade_tanque, litros_abastecidos, quilometragem_percorrida, consumo_medio, autonomia;
        
        System.out.printf("Informe a capacidade do tanque: ");
        capacidade_tanque = scanner.nextFloat();
        
        System.out.printf("Informe litros abastecidos: ");
        litros_abastecidos = scanner.nextFloat();
        
        System.out.printf("Informe quilometragem percorrida: ");
        quilometragem_percorrida = scanner.nextFloat();
        
        consumo_medio = quilometragem_percorrida / litros_abastecidos;
        autonomia = (capacidade_tanque - litros_abastecidos) * consumo_medio;
        
        System.out.printf("Consumo medio: %.1f\n", consumo_medio);
        System.out.printf("Autonomia: %.1f", autonomia);
        
        scanner.close();
    }
}