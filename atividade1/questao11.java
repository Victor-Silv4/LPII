import java.util.Scanner;

public class questao11 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = teclado.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = teclado.nextInt();
        int resultado = num1 + num2;

        if(resultado >= 10) {
            resultado += 5;
        }
        else {
            resultado -= 7; 
        }

        System.out.println(resultado);
        
        teclado.close();
    }
}
