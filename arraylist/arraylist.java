package arraylist;

//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Collections;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Daniela");
        nomes.add("João");
        nomes.add("Marcelo");
        nomes.add("Felipe");
        //nomes.add(0, "Felipe");
        //System.out.println(nomes.get(0));
        //nomes.set(1, "Pedro");
        //nomes.remove("Ana");
        
        //System.out.println("tamanho da lista: " + nomes.size());

        //for(int i = 0; i < nomes.size(); i++){
        //System.out.println(nomes.get(i));
        //}

        //for(String nome : nomes) {
        //    System.out.println(nome);
        //}

        //Collections.sort(nomes);
        System.out.println(nomes);

        Collections.sort(nomes);
        Collections.reverse(nomes);
        System.out.println(nomes);


        scanner.close();
    }
    
}

