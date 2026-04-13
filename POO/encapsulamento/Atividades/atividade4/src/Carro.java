public class Carro {
    private String marca;
    private String modelo;
    private int velocidade;
    private boolean ligado;

    public Carro(String marca, String modelo, int velocidade, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void desligar() {
        if(ligado){
            ligado = false;
        }else{
            System.out.println("O carro já está desligado.");
        }
    }

    public void ligar() {
        if(!ligado){
            ligado = true;
        }
        else{
            System.out.println("O carro já está ligado.");
        }
    }

    public void acelerar() {
        if(ligado){
            velocidade += 10;
        }else{
            System.out.println("O carro está desligado. Ligue o carro para acelerar.");
        }
    }

    public void frear() {
        if(ligado){
            velocidade -= 10;
        }else{
            System.out.println("O carro está desligado. Ligue o carro para frear.");
        }
    }

    public void status() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
        System.out.println("--------------------------------------");
    }
    
}
