package com.bancodio.models;

public class ContaBancaria {
    private String numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria(String numeroConta, String agencia, String nomeCliente, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    
} 