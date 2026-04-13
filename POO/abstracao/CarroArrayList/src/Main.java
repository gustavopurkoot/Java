import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        ArrayList<Carro> carros = new ArrayList<>();

        do {

            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Listar Carros");
            System.out.println("3 - Remover Carro");
            System.out.println("4 - Atualizar Carro");
            System.out.println("5 - Ordenar Carros por Ano");
            System.out.println("0 - Sair");
            System.out.println("-----------------------------");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("Digite a marca do carro: ");
                    String marca = scanner.nextLine();

                    System.out.println("Digite o modelo do carro: ");
                    String modelo = scanner.nextLine();

                    System.out.println("Digite o ano do carro: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    Carro novo = new Carro(marca, modelo, ano);

                    if(novo.getAno() == 0){
                        System.out.println("Carro não cadastrado devido ao ano inválido.");
                        break;
                    }
                    else {
                    carros.add(novo);
                    }

                    System.out.println("Carro cadastrado!");
                    break;

                case 2:
                    if (carros.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado.");
                    } else {
                        for (int i = 0; i < carros.size(); i++) {
                            System.out.println("Carro " + (i + 1) + ":");
                            carros.get(i).status();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o número do carro que deseja remover: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    if (numero > 0 && numero <= carros.size()) {
                        carros.remove(numero - 1);
                        System.out.println("Carro removido!");
                    } else {
                        System.out.println("Número inválido!");
                    }
                    break;

                case 4:
                    System.out.println("Digite o número do carro que deseja atualizar: ");
                    int num = scanner.nextInt();
                    scanner.nextLine();

                    if (num > 0 && num <= carros.size()) {

                        Carro carroAtualizar = carros.get(num - 1);

                        System.out.println("Digite a nova marca do carro: ");
                        String novaMarca = scanner.nextLine();

                        System.out.println("Digite o novo modelo do carro: ");
                        String novoModelo = scanner.nextLine();

                        System.out.println("Digite o novo ano do carro: ");
                        int novoAno = scanner.nextInt();
                        scanner.nextLine();

                            carroAtualizar.setMarca(novaMarca);
                            carroAtualizar.setModelo(novoModelo);
                            carroAtualizar.setAno(novoAno);

                            System.out.println("Carro atualizado!");
                        }

                     else {
                        System.out.println("Número inválido!");
                    }
                    break;

                case 5:
                    if (carros.isEmpty()) {
                        System.out.println("Nenhum carro para ordenar.");
                    } else {
                        Collections.sort(carros, (c1, c2) -> c1.getAno() - c2.getAno());
                        System.out.println("Carros ordenados!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado!");
        scanner.close();
    }
}