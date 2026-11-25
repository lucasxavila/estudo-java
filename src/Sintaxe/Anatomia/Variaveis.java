package Sintaxe.Anatomia;

/*
    # Estrutura
    Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)

    # Exemplo
    int idade = 23;
    double altura = 1.62;

    # Tipos de outras classes, por exemplo:
    Dog spike; // observe que aqui a variável spike não tem valor, é normal

    Declaração inválida de variáveis
    int numero&um = 1; Os únicos símbolos permitidos são _ e $
    int 1numero = 1; Uma variável não pode começar com numérico
    int numero um = 1; Não pode ter espaço no nome da variável
    int long = 1; long faz parte das palavras reservadas da linguagem
*/

// Para o Dog spike; funcionar:
class Dog{}

public class Variaveis {
    public static void main(String[] args) {
        // Tipos de outras classes
        Dog spike;

        // Declaração válida de variáveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1; // ou numeroUm
        int longo = 1;

        // Variáveis Imutáveis
        /*
            obs:
            - a nomenclatura padrão é tudo MAIÚSCULO e separada por _
            - o 'final' é o que realmente torna a variável imutável
        */

        final String BR = "Brasil";
        double PI = 3.14;
        int ESTADOS_BRASILEIRO = 27;
        int ANO_2000 = 2000;

        // Reatribuir Variáveis
        int anoFabricacao = 2021;

        anoFabricacao = 2022; // não repete o tipo da variável
    }
}
