package Sintaxe.Escopo;

public class ContaApp {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.imprimirSaldo();
        conta.sacar(5.0);
    }
}
