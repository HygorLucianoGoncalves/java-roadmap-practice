package org.example.JavaFundamentals.DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(9);//0
        q.add(1);//1
        q.add(2);//2
        q.add(3);//3



        System.out.println("Queue elements: " + q.element());
        q.remove();
        System.out.println("Queue peek:"+q.peek());

        for (int i : q){
            System.out.println(i);
        }


    }
}
