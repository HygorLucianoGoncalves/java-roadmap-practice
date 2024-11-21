package org.example.JavaFundamentals.loops;

public class Loops {
    public static void main(String[] args) {

        System.out.println("JAVA FOR LOOP ----------------------------------------------");
        // JAVA FOR LOOP

        for (int i = 0; i <= 5; i++) { // enquanto o I for menor ou igual a 5 vai fazer o FOR
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int n = 11;

        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }

        System.out.println("JAVA FOR-EACH LOOP ----------------------------------------------");

        // JAVA FOR-EACH LOOP

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        Integer[] number = {156, 27, 388, 499, 50};
        for (String car : cars) {
            System.out.println(car);
        }
        for (Integer i : number) {
            System.out.println(i);
        }

        System.out.println(" JAVA WHILE LOOP ----------------------------------------------");

        // JAVA WHILE LOOP

        int a = 5, e = 10;

        while (a <= e) { // Equandp a não for < ou = a e mostra isso;
            System.out.println(a);
            a++;
        }

        //or

        int testeTwo = 0;

        while (++testeTwo <= 10) {
            System.out.println(testeTwo);
        }


        int teste12 = 20, teste10 = 30;

        do {
            System.out.println(teste12);
            teste12++;
        } while (teste12 <= teste10);
    }
}
