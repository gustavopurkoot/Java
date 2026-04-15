import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<>();
        /* Adiciona o objeto Pessoa ao ArrayList */

        /*
         * for (int i = 0; i < 3; i++) {
         * System.out.print("Informe o nome:");
         * String nome = scanner.nextLine();
         * System.out.print("Informe a idade:");
         * int idade = scanner.nextInt();
         * 
         * scanner.nextLine(); // Limpa o buffer do scanner
         * 
         * lista.add(new Pessoa(nome, idade));
         * }
         */

        lista.add(new Pessoa("Marcelo", 57));
        lista.add(new Pessoa("Maria", 30));
        lista.add(new Pessoa("Pedro", 20));

        String nomeBusca = "Maria";
        boolean encontrado = false;

        for (int i = 0; i < lista.size(); i++) {
            /* Compara os nome ignorando maiúsculas e minúsculas */
        if (lista.get(i).getNome().equalsIgnoreCase(nomeBusca)) {
                lista.get(i).setIdade(21);
                encontrado = true;
                lista.remove(i);
                //System.out.println("Nome: " + lista.get(i).getNome());
                //System.out.println("Idade: " + lista.get(i).getIdade());
            }
        }

        if (!encontrado) {
            System.out.println("Nome não encontrado!");
        }

        else{
            //percorre a lista e exibe os dados de cada pessoa
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Nome: " + lista.get(i).getNome());
                System.out.println("Idade: " + lista.get(i).getIdade());
                System.out.println();
            }
        }

        // lista.sort(Comparator.comparing(Pessoa::getIdade).reversed());

        // scanner.close();
    }
}