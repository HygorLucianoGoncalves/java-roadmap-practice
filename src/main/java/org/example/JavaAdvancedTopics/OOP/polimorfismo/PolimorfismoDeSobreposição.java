package org.example.JavaAdvancedTopics.OOP.polimorfismo;

public class PolimorfismoDeSobreposição {

}

class Brinquedo {
    public void mover() {
        System.out.println("mover brinquedo");
    }
}

class Carro extends Brinquedo {
    public void mover() {
        System.out.println("Correr");
    }
}


class Aviao extends Brinquedo {
    public void mover() {
        System.out.println("VOAR");
    }
}

class Barco extends Brinquedo {
    public void mover() {
        System.out.println("NAVEGAR");
    }
}