public class Banco {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "João";
        conta1.saldo = 1000;
        conta1.depositar(500);
        conta1.sacar(200);
        conta1.exibirInfo();
        conta1.sacar(1400);

    }
}
