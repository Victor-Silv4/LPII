package Atividade_1802;

public abstract class Operacao {
    
    protected double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    public abstract double operar();
}