package org.example.java_fundamentals.oop.polymorphism.sobreposição;

public class Animals {
    public void eat(){
        System.out.println("animals is eating "+
                "___________________________________");
    }
}
class Dog extends Animals{
    public void eat(){
        System.out.println("dog is eating");
    }
}

class Cat extends Animals{
    public void eat(){
        System.out.println("cat is eating");
    }
}

class Horse extends Animals{
    public void eat(){
        System.out.println("horse is eating");
    }
}