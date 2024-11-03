package com.bancodio.services;

import com.bancodio.models.ContaBancaria;
import java.util.Scanner;

public class ContaService {

    public ContaBancaria criarConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial!");
        double saldoInicial = scanner.nextDouble();

        scanner.close();

        return new ContaBancaria(numeroConta, agencia, nomeCliente, saldoInicial);
    }

    public void exibirInformacoes(ContaBancaria conta) {
        System.out.println("Informações da Conta:");
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Cliente: " + conta.getNomeCliente());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}
 