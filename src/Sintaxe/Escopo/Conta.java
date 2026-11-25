package Sintaxe.Escopo;

/*
    class {
        //escopo global ou de classe
        globalNumber = 10

        methodOne() {
            //escopo de método
            myNumber = 1

            print(globalNumber) //10
        }

        methodTwo() {
            //escopo de método
            myNumber = 1

            //escopo de bloco ou de fluxo
            if(true) {
                yourNumber = 2
                myNumber = yourNumber
            }

            print(myNumber) //2
            print(yourNumber) //error - acesso somente dentro do fluxo
        }
    }
*/

public class Conta {
    // variável da classe escopo
    double saldo = 10.0;

    public void sacar(Double valor) {
        // variável do método
        double novoSaldo = saldo - valor;
        System.out.println(novoSaldo);
    }

    public void imprimirSaldo() {
        // disponível em toda classe
        System.out.println(saldo);

        // somente o método sacar conhece esta variável
        // System.out.println(novoSaldo); -> Error
    }
}