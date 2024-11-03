package com.bancodio;

import com.bancodio.models.ContaBancaria;
import com.bancodio.services.ContaService;

public class App {
    public static void main(String[] args) throws Exception {
        ContaService contaService = new ContaService();
        ContaBancaria conta = contaService.criarConta();

        contaService.exibirInformacoes(conta);
        
    }
}
