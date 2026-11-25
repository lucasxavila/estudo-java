package Sintaxe.Exercicios;

import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    Double saldo;
    boolean ativo = true;
    List<Double> extrato;

    public void sacar(Double valorSolicitado) {
        // SEM LÓGICA
    }

    public void transferir(ContaCorrente contaDestino,
                           Double valorSolicitado) {
        // SEM LÓGICA
    }

    public void cancelar(String justificativa) {
        // O algoritmo irá manipular o atributo ativo para que se torne false
    }

    public List<Double> consultarExtrato(LocalDate dateInicial, LocalDate dateFinal) {
        return extrato;
    }

    public Double consultarSaldo() {
        return saldo;
    }
}
