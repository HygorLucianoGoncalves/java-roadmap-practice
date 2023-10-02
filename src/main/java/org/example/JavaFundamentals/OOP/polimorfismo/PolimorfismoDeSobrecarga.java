package org.example.JavaFundamentals.OOP.polimorfismo;

public class PolimorfismoDeSobrecarga {

    public void avaliar() {
        //this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        //this.filme.setAvaliacao(nota);
    }

    public void avaliar(double porc) {
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        }else if (porc <= 50) {
            tot = 5;
        }else if (porc <= 90) {
            tot = 8;
        }else {
            tot = 10;
        }
        //this.filme.setAvaliacao(tot);
    }
}
