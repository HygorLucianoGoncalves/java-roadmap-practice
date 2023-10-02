package org.example.JavaFundamentals;

public class BasicSyntax {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");

        String nome = "nome";
        String nomeNovo = "nomeNovo";

        String trocandoLetraDaString = nome.replace("n", "T");

        //pois o método replace não altera a String original e sim devolve uma nova String.
        // Para contemplar a alteração devemos pegar

        //o resultado do método replace:
        System.out.println(trocandoLetraDaString);
    }




}
