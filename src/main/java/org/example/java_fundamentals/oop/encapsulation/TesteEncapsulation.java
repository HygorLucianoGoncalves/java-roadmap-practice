package org.example.java_fundamentals.oop.encapsulation;

public class TesteEncapsulation {
    //Tipo private, public e protected

    // private use == get and set
    // public use == all
    // protected use == visible within the class and also to the daughters/sons.]

    private static String privateTeste = "Privatte Teste";

    public static String publicTeste = "Public";

    protected static String protecterTeste = "Protecter";

    public static void main(String[] args) {
        System.out.println(getPrivateTeste());
        System.out.println(publicTeste);
        System.out.println(protecterTeste);
    }

    public static String getPrivateTeste() {
        return privateTeste;
    }

    public static void setPrivateTeste(String privateTeste) {
        TesteEncapsulation.privateTeste = privateTeste;
    }
}
