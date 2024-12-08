package atividade3.questao02;

public class ContaPoupanca {

    String nomeCorrentista;
    String rg;
    String cpf;
    double saldo;
    String numero;
    String agencia;

    public ContaPoupanca (String nomeCorrentista, String rg, String cpf, double saldo, String numero , String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf; 
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void alterar (String nomeCorrentista, String rg, String cpf, double saldo, String numero , String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf; 
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void imprimirSaldo() {
        System.out.println("O saldo da conta é:  " + this.saldo);
    }
}