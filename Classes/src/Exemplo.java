public class Exemplo {
    public static void main(String[] args) throws Exception {
        /* Pessoa p1 = new Pessoa();
        p1.nome = "Gustavo";
        p1.idade = 18;
        p1.apresentar();

        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";
        p2.idade = 104;
        p2.apresentar();
        */

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;

        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.ponta = 0.7f;

        c1.destampar();
        c1.rabiscar();

        c2.rabiscar();
        c2.status();

    }
}

