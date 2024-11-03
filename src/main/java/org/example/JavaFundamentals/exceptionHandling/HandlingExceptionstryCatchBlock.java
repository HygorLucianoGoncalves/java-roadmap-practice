    package org.example.JavaFundamentals.exceptionHandling;

    public class HandlingExceptionstryCatchBlock {
        public static void main(String[] args) {
            dividirNumeros(10, 2);   // Divisão válida
            dividirNumeros(10, 0);   // Gera ArithmeticException
            dividirNumeros(10, null); // Gera NullPointerException
        }

        // Handling Exceptions: try-catch Block and Multiple catch Blocks and Exception Hierarchy;
        public static void dividirNumeros(Integer a, Integer b) {
            try {
                int resultado = a / b;
                System.out.println("O resultado da divisão é: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro: Não é possível dividir por zero.");
            } catch (NullPointerException e) {
                System.out.println("Erro: Um dos valores é nulo.");
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            }
        }
    }
