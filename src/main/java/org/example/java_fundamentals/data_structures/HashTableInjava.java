package org.example.java_fundamentals.data_structures;

import java.util.Hashtable;

public class HashTableInjava {
    public static void main(String[] args) {
        Hashtable<Integer, String> numbers = new Hashtable<>();

        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");

        String n = numbers.get(1);
        if (n != null) {
            System.out.println(n);
        }
        System.out.println("----------------------------");
        for (int a : numbers.keySet()) {
            System.out.println(a + ": " + numbers.get(a));

        }
        System.out.println("----------------------------");
        System.out.println("size: " + numbers.size());

        System.out.println("----------------------------");
        System.out.println(numbers.hashCode());

    }
}
