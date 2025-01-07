package org.example.JavaFundamentals.DataStructures;

public class ArrayInJava {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // Criando um array do tipo String com tamanho flexível
        int[] myNum = {10, 20, 30, 40};

        int[] ints = new int[2]; // Criando um array do tipo INT com tamanho fixo

        System.out.println(cars[0]);
        System.out.println(myNum[3]);
        System.out.println(ints[0]);
        System.out.println("-----------------------------------------------------");
        for(String i : cars){
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------------");
        ints[0] = 123;
        ints[1] = 456;
        for (int i : ints){
            System.out.println(i);
        }
        ints[3] = 100;
        // fora do tamanho : erros
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2


    }
}
