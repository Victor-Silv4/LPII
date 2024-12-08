package atividade3.questao02;

public class ProgramaPoupanca {
    public static void main(String[] args) {
        
        ContaPoupanca conta1 = new ContaPoupanca("Victor", "1234567-89", "123.456.789-00", 1000000, "123-456", "1");

        conta1.imprimirSaldo();

        conta1.alterar("Victor", "1234567-89", "123.456.789-00", 2.50, "123-456", "1");

        conta1.imprimirSaldo();
    }
}
