package org.example.JavaAdvancedTopics;

import java.io.*;

public class SerializationEX {

}

//Class who implements Serializable
class person implements Serializable {
    private String name;
    private int year;

    public person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Idade: " + year;
    }
}



class ExemploSerialization {
    public static void main(String[] args) {
        // serialization
        try {
           // CREATE AN OBJECT FROM THE CLASS PERSON
            person person = new person("Alice", 30);

            // create an object from type ObjectOutputStream to write to file
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));

            // Write the object serialized to the file
            out.writeObject(person);

            // close the flow to exit
            out.close();

            System.out.println("Object serialized to save to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialization
        try {
            // Create an object ObjectInputStream to read the file
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("pessoa.ser"));

            // Read the object serialization file
            person personLida = (person) in.readObject();

            // Close the flow of entry
            in.close();

            System.out.println("Object deserialization:");
            System.out.println(personLida);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
