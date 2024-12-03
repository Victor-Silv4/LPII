import java.util.Scanner;

public class questao01 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horas = teclado.nextInt();
        int salario = horas * 20;
        System.out.println("Seu salário será de: " + salario);
        teclado.close();
    }
}