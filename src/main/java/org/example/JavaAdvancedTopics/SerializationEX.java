package org.example.JavaAdvancedTopics;

import java.io.*;

public class SerializationEX {

}

// Classe que implementa Serializable
class Pessoaaa implements Serializable {
    private String nome;
    private int idade;

    public Pessoaaa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}

class ExemploSerialization {
    public static void main(String[] args) {
        // Serialização
        try {
            // Criar um objeto da classe Pessoa
            Pessoaaa pessoaaa = new Pessoaaa("Alice", 30);

            // Criar um objeto ObjectOutputStream para escrever no arquivo
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pessoa.ser"));

            // Escrever o objeto serializado no arquivo
            out.writeObject(pessoaaa);

            // Fechar o fluxo de saída
            out.close();

            System.out.println("Objeto serializado e salvo no arquivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Desserialização
        try {
            // Criar um objeto ObjectInputStream para ler o arquivo
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("pessoa.ser"));

            // Ler o objeto serializado do arquivo
            Pessoaaa pessoaaaLida = (Pessoaaa) in.readObject();

            // Fechar o fluxo de entrada
            in.close();

            System.out.println("Objeto desserializado:");
            System.out.println(pessoaaaLida);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
