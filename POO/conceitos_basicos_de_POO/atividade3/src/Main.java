public class Main {

    public static void main(String[] args) throws Exception {

        Carro carro1 = new Carro();
        carro1.marca = "Ford";
        carro1.modelo = "Mustang";


        Carro carro2 = new Carro();
        carro2.marca = "Chevrolet";
        carro2.modelo = "Camaro";


        carro1.status();
        carro1.ligar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.status();

        carro2.status();
        carro2.ligar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.frear();
        carro2.desligar();
        carro2.acelerar();
        carro2.status(); 
        
    }
}