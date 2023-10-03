package org.example.JavaFundamentals;


public class ExGenerics<T> {// the type generics set much value in the declaration
    private T name;


    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}

class test{
    public static void main(String[] args) {

        ExGenerics<String> exGenerics = new ExGenerics();
        exGenerics.setName("nomeomssdsd");

        System.out.println(exGenerics.getName());

        ExGenerics<Integer> g = new ExGenerics<>();

        g.setName(10);


    }
}