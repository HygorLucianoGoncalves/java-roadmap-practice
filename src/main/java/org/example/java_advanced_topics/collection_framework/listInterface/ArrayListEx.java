package org.example.java_advanced_topics.collection_framework.listInterface;

import java.util.ArrayList;

public class ArrayListEx {
    /**
     *
     * A classe ArrayList implementa a interface List.
     * Ele usa uma matriz dinâmica para armazenar o elemento duplicado de diferentes tipos de dados.
     * A classe ArrayList mantém a ordem de inserção e não é sincronizado.
     * Os elementos armazenados na classe ArrayList podem ser aleatoriamente Acessado.
     *
     */
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        for(String nome : list){
            System.out.println(nome);
        }

    }

}
