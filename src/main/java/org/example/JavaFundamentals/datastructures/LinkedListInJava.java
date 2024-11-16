package org.example.JavaFundamentals.datastructures;


import java.util.LinkedList;

public class LinkedListInJava {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars.get(2));
        System.out.println(cars);
        System.out.println("-------------------------------------------");

        System.out.println("REMOVE FIRST");
        System.out.println(cars.removeFirst());

        System.out.println("-------------------------------------------");
        cars.forEach(System.out::println);


    }
}
