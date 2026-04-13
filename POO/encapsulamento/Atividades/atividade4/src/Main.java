public class Main {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro("Toyota", "Corolla", 0, false);
        c1.status();
        c1.ligar();
        c1.acelerar();
        c1.status();

        Carro c2 = new Carro("Honda", "Civic", 0, false);
        c2.status();
        c2.acelerar();
        c2.ligar();
        c2.acelerar();
        c2.acelerar();
        c2.status();
    }
}
