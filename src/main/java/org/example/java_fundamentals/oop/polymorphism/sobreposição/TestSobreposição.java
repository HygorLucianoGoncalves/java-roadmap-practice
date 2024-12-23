package org.example.java_fundamentals.oop.polymorphism.sobreposição;

public class TestSobreposição {
    public static void main(String[] args) {
    Animals animal = new Animals();
    animal.eat();

    Animals animal2 = new Dog();
    animal2.eat();

    Animals cat = new Cat();
    cat.eat();

    }

}
