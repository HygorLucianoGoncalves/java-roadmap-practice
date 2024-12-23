package org.example.java_advanced_topics.streamsandlambda;

import java.util.ArrayList;
import java.util.List;

public class TesteLambda {
}
class AntesDoLambda{
    public static void main(String[] args) {
        //ANTES DO LAMBDA
        List<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        for (String i : list){
            System.out.println(i);
        }

    }
}

class DepoisDoLambda{
    public static void main(String[] args) {
        //ANTES DO LAMBDA
        List<String> list1 = new ArrayList<>();
        list1.add("Ravi");
        list1.add("Vijay");
        list1.add("Ravi");
        list1.add("Ajay");

        list1.forEach(c -> System.out.println(c));
    }
}