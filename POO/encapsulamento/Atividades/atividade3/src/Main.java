public class Main {
    public static void main(String[] args) throws Exception {
        ContaBancaria c1 = new ContaBancaria("Gustavo", 1000);
        System.out.println("Titular: " + c1.getTitular());
        c1.ExibirSaldo();
        c1.sacar(100);
        c1.ExibirSaldo();

        ContaBancaria c2 = new ContaBancaria("Maria", 500);
        System.out.println("Titular: " + c2.getTitular());
        c2.ExibirSaldo();
        c2.depositar(500);
        c2.ExibirSaldo();
    }
}
