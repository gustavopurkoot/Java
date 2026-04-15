public class Carro {
    String marca;
    String modelo;
    int velocidade;
    boolean ligado;

    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Carro desligado!");
    }

    public void acelerar() {
        if (ligado) {
            velocidade += 10;
        } else {
            System.out.println("Não é possível acelerar, carro desligado!");
        }
    }

    public void frear() {
        velocidade -= 10;
        if (velocidade < 0) {
            velocidade = 0;
        }

    }

    public void status() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
    }
}