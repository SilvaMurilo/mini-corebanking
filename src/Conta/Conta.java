package Conta;

public class Conta {
    private String numero;
    private double saldo;

    public Conta (String numero){
        this.numero = numero;
        this.saldo = 0;
    }
    public String buscarDetalhes(){
        return "O número da conta é: " + this.numero;
    }
    public double buscarSaldo(){
        return this.saldo;
    }
    public String depositar(double valor) {
        saldo += valor;
        return "Saldo alterado com sucesso!";
    }
}
