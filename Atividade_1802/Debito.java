package Atividade_1802;

public class Debito extends Operacao{
    
    public Debito(double valor) {
        super(valor);
    }

    @Override
    public double operar() {
        return -valor;
    }
}
