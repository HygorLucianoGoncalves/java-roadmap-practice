package org.example.java_fundamentals.oop.abstraction;

public class TestConta {
    public static void main(String[] args) {
        ContaCorrente testOne = new ContaCorrente(100.0);
        testOne.deposito(200.0);
        testOne.sacar(300.0);

        testOne.deposito(1.0);
        System.out.println(testOne.getSaldo());
    }
}
