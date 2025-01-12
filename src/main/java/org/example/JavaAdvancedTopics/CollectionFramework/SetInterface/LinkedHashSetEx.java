package org.example.JavaAdvancedTopics.CollectionFramework.SetInterface;

import java.util.*;

public class LinkedHashSetEx {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");


        System.out.println(linkedHashSet);

        linkedHashSet.forEach(System.out::println);

        linkedHashSet.remove("B");
        System.out.println(linkedHashSet);



    }
}
