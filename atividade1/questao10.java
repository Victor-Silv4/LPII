import java.util.Scanner;

public class questao10 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = teclado.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = teclado.nextInt();

        if(num1 + num2 > 10) {
            System.out.println(num1 + num2);
        }
        
        teclado.close();
    }
}
