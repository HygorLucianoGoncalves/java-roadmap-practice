package org.example.JavaFundamentals.OOP.abstração.interfaces;

import java.lang.reflect.AccessibleObject;

public class Teste implements Interface2, Interface3 {
    public static void main(String[] args) {
//        Cliente cliente = new Cliente();
//        cliente.senha("senha11");
//        cliente.auth("senha1123");

        Teste teste = new Teste();

        teste.Show();
        teste.show1();
        teste.show2();


    }
}

interface API {
    default void Show() {
        System.out.println("API ONE");

    }

    default void show1() {
        System.out.println("TEste 1");
    }
}

interface Interface1 extends API {
    default void show1() {
        System.out.println("sei não");
    }

    default void Show() {
        System.out.println("API DUO");

    }
}

interface Interface3 extends API {

}

interface Interface2 extends Interface1 {
    default void show2() {
        System.out.println("TEste 2");
    }
}
