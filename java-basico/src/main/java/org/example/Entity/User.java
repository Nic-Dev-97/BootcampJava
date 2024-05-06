package org.example.Entity;

public class User {
    private String nome;
    private String agencia;
    private String numeroConta;
    private double saldo;

    public User(String nome, String agencia, String numeroConta, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
