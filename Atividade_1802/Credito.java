package Atividade_1802;

public class Credito extends Operacao{
    
    public Credito(double valor) {
        super(valor);
    }
    

    @Override
    public double operar() {
        return valor;
    }
}
