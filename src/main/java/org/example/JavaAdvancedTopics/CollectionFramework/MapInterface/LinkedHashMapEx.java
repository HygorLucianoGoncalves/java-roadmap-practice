package org.example.JavaAdvancedTopics.CollectionFramework.MapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        //Create
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(5, "Five");


        //Read
        System.out.println(linkedHashMap);
        linkedHashMap.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println(linkedHashMap.get(1));
        System.out.println(linkedHashMap.getOrDefault(6, null));
        System.out.println("------------------------------");

        //Update
        linkedHashMap.put(1, "Eleven");
        linkedHashMap.put(2, "Twelve");
        System.out.println(linkedHashMap);
        System.out.println("------------------------------");

        //Delete
        linkedHashMap.remove(2);
        System.out.println(linkedHashMap);


    }
}
