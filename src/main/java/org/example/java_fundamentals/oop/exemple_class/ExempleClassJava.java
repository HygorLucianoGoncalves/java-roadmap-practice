package org.example.java_fundamentals.oop.exemple_class;

public class ExempleClassJava {
    // ExempleClassJava: Name of Class

    int value;
    int valueOne;
    int sun = 0;

    //Constructor
    public ExempleClassJava(int value, int valueOne) {
        this.value = value;
        this.valueOne = valueOne;
        sun = value + valueOne;
    }

    public static void main(String[] args) {
        ExempleClassJava obj = new ExempleClassJava(5, 5);// Cria um novo obj da class e faz a soma do sun quando e criado a CLASS

        obj.valueOne = 100;
        obj.value = 1000;

        System.out.printf("sun: %d%n", obj.sun);
        System.out.println("---------------------------------------");
        System.out.println(obj.valueOne);
        System.out.println(obj.value);

    }
}
