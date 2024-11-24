package org.example.JavaFundamentals.oop.inheritance;

public class Employee {
    String name;
    String lastName;
    int salary = 9000;

     //test
    public int salaryValueNew(int newSalary) {
        int valueNew = 0;
        valueNew = this.salary - newSalary;
        return valueNew;
    }
}

class Developer extends Employee {
    int bonus = 100;
    int salaryDeveloper = salary + bonus;


    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.name = "Teste name";
        developer.lastName = "test last name";

        System.out.println("Programmer salary is: " + developer.salary);
        System.out.println("Bonus of Programmer is: " + developer.bonus);
        System.out.println("Developer salary is: " + developer.salaryDeveloper);
        System.out.println("--------------------------------------------------------");
        System.out.println("name developer: " + developer.name + " " + developer.lastName);
        System.out.println("------------------------TEST--------------------------------");
        System.out.println("new salary developer: " + developer.salaryValueNew(1000));

    }
}
