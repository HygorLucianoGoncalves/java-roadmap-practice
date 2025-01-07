package org.example.JavaFundamentals.OOP.Test2.OOP.encapsulamento;

public class TestePrivate {
    public static void main(String[] args) {
        TIPOS TIPOS = new TIPOS("nome", "sobrenome",18);

        System.out.println(TIPOS.getNome());
        System.out.println(TIPOS.getSobrenome());
        System.out.println(TIPOS.getIdade());
    }
}
