package org.example.JavaAdvancedTopics.CollectionFramework.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

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
