package org.example.JavaAdvancedTopics.CollectionFramework.MapInterface;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap();

        //Create
        hashMap.put(1, "value1");
        hashMap.put(2, "value2");
        hashMap.put(3, "value3");
        hashMap.put(4, "value4");
        hashMap.put(5, "value5");
        hashMap.put(1, "value11");

        //Read
        System.out.println(hashMap);
        hashMap.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("------------------------------");

        //Update
        hashMap.put(5, "value50");
        System.out.println(hashMap);
        System.out.println(hashMap.size());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());
        System.out.println("------------------------------");

        //Delete
        hashMap.remove(5);
        System.out.println(hashMap);
    }
}
