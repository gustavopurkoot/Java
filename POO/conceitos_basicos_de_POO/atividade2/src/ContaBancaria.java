public class ContaBancaria {

    String titular;
    double saldo = 0;
    
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public void exibirInfo(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }
}
