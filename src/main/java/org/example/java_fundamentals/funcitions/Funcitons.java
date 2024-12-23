package org.example.java_fundamentals.funcitions;

import java.util.ArrayList;

public class Funcitons {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(5);
            numbers.add(9);
            numbers.add(8);
            numbers.add(1);

        //Java Lambda Expressions
        numbers.forEach( (n) -> System.out.println(n));

        //or

        // os dois são a mesma coisa
        numbers.forEach(System.out::println);


        System.out.println(soma(50,50));
    }
    public static int soma(int valor1, int valor2){
        return valor1 + valor2;
    }
}
