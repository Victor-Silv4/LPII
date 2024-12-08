package atividade3.questao06;

import java.util.Scanner;

public class ProgramaCalculadora {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        double num1, num2, resultado;
        String operacao;

        System.out.println("Digite o primeiro número: ");
        num1 = teclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = teclado.nextDouble();
        System.out.println("Digite a operação (+, -, /, *)");
        operacao = teclado.next();

        switch (operacao) {
            case "+":
                resultado = calculadora.somar(num1, num2);
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            
            case "-":
                resultado = calculadora.subtrair(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;
            case "*":
                resultado = calculadora.multiplicar(num1, num2);
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;
            case "/":
                resultado = calculadora.dividir(num1, num2);
                System.out.println(num1 + " / " + num2 + " = " + resultado);
                break;
            default:
                System.out.println("Operação inválida");
        }

        teclado.close();

    }
}
