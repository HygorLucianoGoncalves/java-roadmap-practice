package org.example.java_advanced_topics.OOP.abstração.interfaces;

public class Cliente implements Auth{
    private String senha;

    @Override
    public void senha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean auth(String senha) {
        if (this.senha == senha) {
            System.out.println("Ok");
            return true;
        }
        else {
            System.out.println("Senha errada");
            return false;
        }
    }
}
