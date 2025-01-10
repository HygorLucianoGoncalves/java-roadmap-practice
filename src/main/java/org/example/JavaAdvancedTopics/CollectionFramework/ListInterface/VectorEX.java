package org.example.JavaAdvancedTopics.CollectionFramework.ListInterface;

import java.util.Vector;

/**
 * O Vector usa uma matriz dinâmica para armazenar os elementos de dados.
 * É semelhante ao ArrayList.
 * Contudo Ele é sincronizado e contém muitos métodos que não fazem parte da coleção estrutura.
 */
public class VectorEX {
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");


        for (String nomes: v){
            System.out.println(nomes);
        }
    }
}
