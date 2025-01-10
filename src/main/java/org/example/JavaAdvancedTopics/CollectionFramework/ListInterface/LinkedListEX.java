package org.example.JavaAdvancedTopics.CollectionFramework.ListInterface;

import java.util.LinkedList;

public class LinkedListEX {
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        al.remove(2);
        System.out.println(al);
        al.forEach(System.out::println);
    }
}
