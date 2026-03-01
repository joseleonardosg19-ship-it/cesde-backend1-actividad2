package com.example;

public class CuentaBancaria {

    // Atributos privados
    private String titular;
    private double saaldo;

    // 1. Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;

        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    // 2. Getters y Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // SOLO GETTER para saldo
    public double getSaldo() {
        return saldo;
    }

    // 3. Método depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    // 4. Método retirar
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
              }else{
        System.out.println("error de fondos insuficientes");    

        
        }
    }
}