package Atividade_1802;

public class ContaCorrente {
    
    private double saldo;
    
    public ContaCorrente() {
        this.saldo = 0;
    }
    
    public void executarOperacao(Operacao opr) {
        saldo += opr.operar();
    }
    
    public double getSaldo() {
        return saldo;
    }
}
