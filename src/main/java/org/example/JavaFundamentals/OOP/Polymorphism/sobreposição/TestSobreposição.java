package org.example.JavaFundamentals.OOP.Polymorphism.sobreposição;

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
