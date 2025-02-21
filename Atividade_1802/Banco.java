package Atividade_1802;

public class Banco {
    public static void main(String[] args) {

        Correntista cliente = new Correntista("Victor");
        ContaCorrente conta = cliente.getContaCorrente();
        
        conta.executarOperacao(new Credito(500));
        conta.executarOperacao(new Debito(200));
        
        System.out.println("Saldo de " + cliente.getNome() + ": " + conta.getSaldo());
    }
}
