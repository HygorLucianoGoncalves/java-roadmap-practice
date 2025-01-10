package org.example.JavaAdvancedTopics.CollectionFramework.ListInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        //Create
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        //Read
        System.out.println(queue);
        queue.forEach(System.out::println);
        queue.getFirst();
        queue.getLast();
        System.out.println("Update-------------------------------------");

        //Update
        queue.addFirst(100);
        queue.addLast(200);
        System.out.println(queue);
        System.out.println("Delete-------------------------------------");

        //Delete
        queue.removeFirst();
        System.out.println(queue);
        System.out.println("-------------------------------------");

        queue.remove();
        queue.removeLast();
        System.out.println(queue);



    }
}
