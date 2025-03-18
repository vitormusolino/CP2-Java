package br.com.checkpoint.java;

import br.com.checkpoint.java.tipoconta.ContaCorrente;
import br.com.checkpoint.java.tipoconta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1,"Vitor",2000);
        ContaCorrente contaCorrente = new ContaCorrente(2, "Vitor", 2000, 700);
        ContaPoupanca contaPoupanca = new ContaPoupanca(3,"Vitor",2000);

        System.out.println("------------------------------------------------------");
        System.out.println("Conta Bancária:");
        conta.depositar(500);
        conta.saque(300);
        conta.exibirSaldo();

        System.out.println("------------------------------------------------------");
        System.out.println("Conta corrente:");
        contaCorrente.depositar(1000);
        contaCorrente.saque(1000);
        contaCorrente.exibirSaldo();
        contaCorrente.saque(500);
        System.out.println("------------------------------------------------------");
        System.out.println("Conta Poupança");
        contaPoupanca.consultarRendimento(3);
        contaPoupanca.depositar(500);
        contaPoupanca.saque(300);
        contaPoupanca.exibirSaldo();


    }
}