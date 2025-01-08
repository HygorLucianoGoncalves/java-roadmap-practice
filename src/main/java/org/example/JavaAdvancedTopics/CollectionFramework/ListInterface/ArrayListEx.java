package org.example.JavaAdvancedTopics.CollectionFramework.ListInterface;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String args[]) {
        ArrayList<String> listNames = new ArrayList<String>();//Creating arraylist
        listNames.add("Ravi");
        listNames.add("Vijay");
        listNames.add("João");
        listNames.add("Ajay");
        listNames.add("aloo");

        listNames.remove("Ravi");//remove Ravi
        listNames.removeFirst();//remove Vijay
        listNames.removeLast();//remove aloo

        System.out.println("test .get: " + listNames.get(0));

        listNames.forEach(System.out::println);

    }

}
