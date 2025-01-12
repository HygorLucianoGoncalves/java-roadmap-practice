package org.example.JavaAdvancedTopics.CollectionFramework.SetInterface;

import java.util.HashSet;

/**
 * A classe HashSet implementa Set Interface.
 * Ele representa a coleção que usa uma tabela de hash para armazenamento.
 * O hash é usado para armazenar os elementos no HashSet. Contém Itens.
 */
public class HashSetEX {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();

        //Create
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("A");

        //Read
        System.out.println(set);
        System.out.println("------------------------------------");
        for (String nome : set) {
            System.out.println(nome);
        }

        //Remove
        set.remove("B");
        System.out.println("------------------------------------");
        System.out.println(set);
        //Update
        set.clear();

        set.add("Aa");
        set.add("Bb");
        set.add("Cc");
        System.out.println("------------------------------------");
        System.out.println(set);


    }
}
