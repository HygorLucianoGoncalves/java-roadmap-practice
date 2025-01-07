package org.example.JavaFundamentals.ExceptionHandling;

public class ThefinallyBlock {
    public static void main(String[] args) {
        dividirNumeros(10, 2);// Divisão válida
        System.out.println("-----------------------------");
        dividirNumeros(10, 0);   // Gera ArithmeticException
    }

    public static void dividirNumeros(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        } finally {
            System.out.println("Operação finalizada."); // Sempre executado
        }
    }
}
