package org.example.JavaFundamentals.oop.abstraction;


public class ContaCorrente implements Conta {
    private Double saldo;


    public ContaCorrente(Double saldo) {
        if (saldo == null) saldo = 0.0;
        this.saldo = saldo;
    }

    @Override
    public void deposito(double valor) {
        setSaldo(saldo + valor);

    }

    @Override
    public void sacar(double valor) {
        setSaldo(saldo - valor);

    }


    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
