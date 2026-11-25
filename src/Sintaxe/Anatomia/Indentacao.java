package Sintaxe.Anatomia;

public class Indentacao {

    // Sem indentação
    class BoletimEstudantilSemIndentacao {
    public static void main(String[] args) {
    int mediaFinal = 6;
    if(mediaFinal<6)
    System.out.println("REPROVADO");
    else if(mediaFinal==6)
    System.out.println("PROVA MINERVA");
    else
    System.out.println("APROVADO");
    }
    }

    // Com indentação
    class BoletimEstudantilComIndentacao {
        public static void main(String[] args) {
            int novaMediaFinal = 6;
            if(novaMediaFinal<6)
                System.out.println("REPROVADO");
            else if(novaMediaFinal==6)
                System.out.println("PROVA MINERVA");
            else
                System.out.println("APROVADO");
        }
    }
}
