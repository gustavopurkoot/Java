import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class Temperaturas {

    public static void main(String[] args) throws Exception {

        /* Lista que armazenará as linhas do arquivo */
        ArrayList<String> lista = new ArrayList<>();

        /* Arquivo */
        File arquivo = new File("temperaturas.txt");

        /* Leitura do arquivo */
        Scanner leitor = new Scanner(arquivo);

        while (leitor.hasNextLine()) {
            lista.add(leitor.nextLine());
        }

        leitor.close();

        double somaTemperaturas = 0;

        for (String linha : lista) {

            String[] partes = linha.split(";");
            double temperatura = Double.parseDouble(partes[1]);

            somaTemperaturas += temperatura;
        }

        double mediaAnual = somaTemperaturas / lista.size();

        System.out.println("-------------------------------------------");
        System.out.println("Mês              Temperatura      Diferença");
        System.out.println("-------------------------------------------");

        for (String linha : lista) {

            String[] partes = linha.split(";");

            String mes = partes[0];
            double temperatura = Double.parseDouble(partes[1]);

            double diferenca = temperatura - mediaAnual;

            System.out.printf(
                "%-15s %10.1f°C %12s%.1f°C\n",
                mes,
                temperatura,
                (diferenca >= 0 ? "+" : ""),
                diferenca
            );
        }

        System.out.println("-------------------------------------------");

        System.out.printf(
            "Temperatura média anual: %.1f°C\n",
            mediaAnual
        );
    }
}