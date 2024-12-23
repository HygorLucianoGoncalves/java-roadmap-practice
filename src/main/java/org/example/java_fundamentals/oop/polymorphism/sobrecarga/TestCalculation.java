package org.example.java_fundamentals.oop.polymorphism.sobrecarga;

public class TestCalculation {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();

        System.out.println(calculation.sum(10,70));
        System.out.println(calculation.sum(10.30,80.15));
        System.out.println(calculation.sum(10,70.20));
    }
}
