package org.example.java_fundamentals.exception_handling;

public class CreatingCustomExceptions extends Exception {
    public CreatingCustomExceptions(String message) {
        super(message);
    }

}

class TesteCustomExceptions{
    public static void main(String[] args) {
        try {
            verificarIdade(20); // Idade válida
            System.out.println("----------------------------------");
            verificarIdade(15); // Idade inválida, lança IdadeInvalidaException
        } catch (CreatingCustomExceptions e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void verificarIdade(int idade) throws CreatingCustomExceptions {
        if (idade < 18) {
            throw new CreatingCustomExceptions("Idade inválida: é necessário ter pelo menos 18 anos.");
        }
        System.out.println("Idade verificada: acesso permitido.");
    }
}