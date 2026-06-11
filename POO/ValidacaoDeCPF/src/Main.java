import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int digitoVerificador;
        int soma = 0;
        int resto;
        boolean iguais = true;

        System.out.print("Digite o CPF: ");
        String cpf = scanner.next();

        if (cpf.length() != 11) {
            System.out.println("CPF inválido!");
            return;
        }

        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                iguais = false;
                break;
            }
        }

        if (iguais) {
            System.out.println("CPF inválido (dígitos iguais).");
            return;
        }

        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - 48) * (10 - i);
        }

        resto = soma % 11;

        if (11 - resto > 9) {
            digitoVerificador = 0;
        } else {
            digitoVerificador = 11 - resto;
        }

        if ((cpf.charAt(9) - 48) != digitoVerificador) {
            System.out.println("CPF inválido!");
            return;
        }

        soma = 0;

        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - 48) * (11 - i);
        }

        resto = soma % 11;

        if (11 - resto > 9) {
            digitoVerificador = 0;
        } else {
            digitoVerificador = 11 - resto;
        }

        if ((cpf.charAt(10) - 48) != digitoVerificador) {
            System.out.println("CPF inválido!");
            return;
        }

        System.out.println("CPF válido!");

        scanner.close();

    }
}
