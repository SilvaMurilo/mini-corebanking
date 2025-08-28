import Conta.Conta;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Conta primeiraConta = new Conta("123");
       System.out.println(primeiraConta.buscarDetalhes());
       System.out.println(primeiraConta.depositar(-2));
       System.out.println(primeiraConta.depositar(2.53));
       System.out.println(primeiraConta.sacar(-2));
       System.out.println(primeiraConta.sacar(1));
       System.out.println(primeiraConta.sacar(2));
       Conta segundaConta =  new Conta("456");
       System.out.println(primeiraConta.transferir(10, segundaConta));
       System.out.println(primeiraConta.transferir(1.43, segundaConta));
       System.out.println("Saldo conta 1: " + primeiraConta.buscarSaldo());
       System.out.println("Saldo conta 2: " + segundaConta.buscarSaldo());

    }
}