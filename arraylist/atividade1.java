package arraylist;

import java.util.*;

public class atividade1 {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Fernando");
        nomes.add("Diego");

        System.out.println(nomes);
        nomes.add("Helena");
        System.out.println(nomes);
        nomes.add(0, "Gustavo");
        System.out.println(nomes);

        if (nomes.contains("Fernando")) {
            System.out.println("O nome esta na lista!");
        } else {
            System.out.println("O nome nao esta na lista!");
        }
        System.out.println(nomes);

        nomes.remove("Ana");
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);
        nomes.clear();
        System.out.println(nomes);
    }

}
