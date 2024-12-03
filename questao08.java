import java.util.Scanner;

public class questao08 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
    
 
        System.out.println("Digite o valor do raio da circunferência: ");
        float raio = teclado.nextFloat();

        double areaCirculo = 3.14 * (raio * raio);

        System.out.println("A area de um circulo de raio " + raio + " é aproximadamente: " + areaCirculo);

        teclado.close();
    }
}
