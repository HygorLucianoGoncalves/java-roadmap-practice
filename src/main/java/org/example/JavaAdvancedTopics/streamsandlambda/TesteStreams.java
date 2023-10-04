package org.example.JavaAdvancedTopics.streamsandlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStreams {
    public static void main(String[] args) {
        Clients cliente = new Clients("nameTeste",12);
        Clients cliente1 = new Clients("nameTeste01",19);
        Clients cliente2 = new Clients("nameTeste02",17);
        Clients cliente3 = new Clients("nameTeste03",18);

        List<Clients> list = new ArrayList<>();

        list.add(cliente);
        list.add(cliente1);
        list.add(cliente2);
        list.add(cliente3);

        //list.stream().filter(c -> c.getYear() < 19);    //show on screen clients who are lower eighteen years

        List<Clients> filterTeste = list.stream().filter(c -> c.getYear() < 18).collect(Collectors.toList());

        filterTeste.forEach(c -> System.out.println(c.getYear()));

        //*******************************


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> mapTest = numeros.stream().map(a -> a * a).collect(Collectors.toList());
        System.out.println("MAPTEST");
        mapTest.forEach(System.out::println);
    }
}

class Clients {
    private String name;
    private Integer year;

    public Clients(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}