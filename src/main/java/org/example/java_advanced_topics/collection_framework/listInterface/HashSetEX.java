package org.example.java_advanced_topics.collection_framework.listInterface;

import java.util.HashSet;

/**
 * A classe HashSet implementa Set Interface.
 * Ele representa a coleção que usa uma tabela de hash para armazenamento.
 * O hash é usado para armazenar os elementos no HashSet. Contém Itens.
 */
public class HashSetEX {
    public static void main(String args[]){
//Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
//Traversing elements
        for (String nome: set){
            System.out.println(nome);
        }
    }
}
