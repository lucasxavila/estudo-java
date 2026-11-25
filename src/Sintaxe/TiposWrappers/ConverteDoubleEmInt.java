package Sintaxe.TiposWrappers;
/*
    # Forma incorreta. Necessário converter de double para int:

    public static void main(String[] args) {
        double numeroDouble = 123.56;
        int numeroInt = numeroDouble; // error - não converte de forma implícita
    }
*/

public class ConverteDoubleEmInt {
    public static void main(String[] args) {
        double numeroDouble = 123.56;
        int numeroInt = (int) numeroDouble; // conversão explícita
        System.out.println(numeroInt); // 123
    }
}