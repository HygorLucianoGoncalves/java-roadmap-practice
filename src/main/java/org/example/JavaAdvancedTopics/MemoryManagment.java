package org.example.JavaAdvancedTopics;

public class MemoryManagment {
}
class ExemploMemoryManagement {
    public static void main(String[] args) {
        // Criar um objeto da classe Pessoa
        Pessoaaa pessoaaa1 = new Pessoaaa("Alice", 30);

        // Criar outro objeto da classe Pessoa
        Pessoaaa pessoaaa2 = new Pessoaaa("Bob", 25);

        // Remover a referência ao objeto pessoa1
        pessoaaa1 = null;

        // Nesse ponto, o objeto pessoa1 se tornou elegível para coleta de lixo (garbage collection)
        // O garbage collector irá liberar a memória ocupada por pessoa1 em algum momento

        // Realizar outras operações...

        // Criar um terceiro objeto da classe Pessoa
        Pessoaaa pessoaaa3 = new Pessoaaa("Charlie", 35);

        // Remover a referência ao objeto pessoa3
        pessoaaa3 = null;

        // Nesse ponto, o objeto pessoa3 se tornou elegível para coleta de lixo
        // O garbage collector irá liberar a memória ocupada por pessoa3 em algum momento

        // Realizar outras operações...

        // O garbage collector irá automaticamente liberar a memória dos objetos não referenciados
        // Não é necessário chamar explicitamente um método de liberação de memória
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
