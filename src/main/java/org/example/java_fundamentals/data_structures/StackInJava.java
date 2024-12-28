package org.example.java_fundamentals.data_structures;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackInJava {


    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.push(5);
        stack.push(stack.pop());


        System.out.println("peek = "+ stack.peek());

        for (Integer i : stack) {
            System.out.println(i);
        }

    }

}
