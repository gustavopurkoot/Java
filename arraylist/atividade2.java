package arraylist;

import java.util.*;

public class atividade2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um numero: ");
            numeros.add(scanner.nextInt());
        }

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
    }
}

