package Conta;

public class Conta {
    private String numero;
    private double saldo;

    public Conta (String numero){
        this.numero = numero;
        this.saldo = 0;
    }
    public String buscarDetalhes (){
        return "O número da conta é: " + this.numero;
    }
    public double buscarSaldo(){
        return Math.round(this.saldo * 100.0) / 100.0;
    }
    public String depositar (double valor) {
        valor = Math.round(valor * 100.0) / 100.0;
        if(valor < 0) return "Valor a ser depositado deve ser maior que zero.";
        double novoSaldo = this.saldo + valor;
        this.saldo = Math.round(novoSaldo * 100.0) / 100.0;
        return "Depósito DE R$ " + valor + " realizado com sucesso! O novo saldo é de: R$ " + this.saldo;
    }
    public String sacar (double valor) {
        valor = Math.round(valor * 100.0) / 100.0;
        if(valor < 0) return "Valor a ser sacado deve ser maior que zero.";
        if(valor > saldo) return "Saldo insuficiente para completar essa operação.";
        double novoSaldo = this.saldo - valor;
        this.saldo = Math.round(novoSaldo * 100.0) / 100.0;
        return "Saque de R$ " + valor + " realizado com sucesso! O novo saldo é de: R$ " + saldo;
    }
    public String transferir(double valor, Conta contaDestino){
        valor = Math.round(valor * 100.0) / 100.0;
        if(valor < 0) return "Valor a ser transferido deve ser maior que zero.";
        if(valor > saldo) return "Saldo insuficiente para completar essa operação.";
        if(numero.equals(contaDestino.numero)) return "Não é possível transferir para a mesma conta de origem.";
        double novoSaldoOrigem = this.saldo - valor;
        this.saldo = Math.round(novoSaldoOrigem * 100.0) / 100.0;

        double novoSaldoDestino = contaDestino.saldo + valor;
        contaDestino.saldo = Math.round(novoSaldoDestino * 100.0) / 100.0;
        return "Transferência de R$ " + valor + " para a conta " + contaDestino.numero + " realizada com sucesso! O novo saldo é de R$ " + saldo;
    }
}
