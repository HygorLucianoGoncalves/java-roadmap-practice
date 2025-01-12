package org.example.JavaAdvancedTopics.CollectionFramework.SetInterface;

import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(1);

        System.out.println(ts);

        ts.forEach(System.out::println);
    }
}
