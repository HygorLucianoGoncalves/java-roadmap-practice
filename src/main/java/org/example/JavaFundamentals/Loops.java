package org.example.JavaFundamentals;

public class Loops {
    public static void main(String[] args) {

        // JAVA FOR LOOP

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int n = 11;

        for (int i=1; i< n; i++){
            System.out.println(i);
        }


        // JAVA FOR-EACH LOOP

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String car: cars){
            System.out.println(car);
        }


        // JAVA WHILE LOOP

        int a = 5, e = 10;

        while (a <= e){ // Equandp a não for < ou = a e mostra isso;
            System.out.println(a);
            a++;
        }

        int teste12 = 20, teste10 = 30;
        do {
            System.out.println(teste12);
            teste12++;
        }while (teste12 <= teste10);

    }
}
