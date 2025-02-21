import Atividade_1802.Banco;
import Atividade_1802.ContaCorrente;

public class App {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        ContaCorrente conta3 = new ContaCorrente();
        
        Banco banco = new Banco("Victor", conta1, "Maria", conta2, "João", conta3);
        
        
        banco.creditar("Victor", 1000);
        banco.debitar("Maria", 200);
        banco.transferir("Victor", "João", 300);
        
        System.out.println("Saldo de Victor: " + banco.getSaldo("Victor"));
        System.out.println("Saldo de Maria: " + banco.getSaldo("Maria"));
        System.out.println("Saldo de João: " + banco.getSaldo("João"));
    }
}
