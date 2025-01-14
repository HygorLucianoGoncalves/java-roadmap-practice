package org.example.JavaAdvancedTopics.CollectionFramework.MapInterface;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Integer, String> alunos = new Hashtable<>();

        //Create
        alunos.put(1, "João");
        alunos.put(2, "Pedro");
        alunos.put(3, "Maria");
        alunos.put(4, "Pedro");
        alunos.put(5, "Pedro");

        //Read
        System.out.println(alunos);
        alunos.forEach((key, value) -> System.out.println("Aluno "+key + ": " + value));
        System.out.println(alunos.get(3));
        System.out.println("------------------------------");

        //Update
        alunos.put(1, "Fernando");
        alunos.put(1, "Chico coins");
        alunos.forEach((key, value) -> System.out.println("Aluno "+key + ": " + value));
        System.out.println(alunos);
        System.out.println("------------------------------");

        //Delete
        alunos.remove(1);
        alunos.forEach((key, value) -> System.out.println("Aluno "+key + ": " + value));
        alunos.put(1, "Fernando");
        System.out.println(alunos);


    }
}
