package org.example.java_advanced_topics.collection_framework.listInterface;

import java.util.LinkedList;

/**
 * LinkedList implementa a interface de coleção.
 * Ele usa uma lista duplamente vinculada internamente para armazenar os elementos.
 * Ele pode armazenar os elementos duplicados. Mantém a ordem de inserção e não está sincronizado.
 * No LinkedList, a manipulação é rápida porque nenhuma mudança é necessária
 */
public class LinkedListEX {
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        for (String teste : al){
            System.out.println(teste);
        }
    }
}
