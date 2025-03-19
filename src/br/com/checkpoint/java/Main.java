package br.com.checkpoint.java;

import br.com.checkpoint.java.tipoconta.ContaCorrente;
import br.com.checkpoint.java.tipoconta.ContaPoupanca;
import br.com.checkpoint.java.tipoconta.ContaSalario;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1,"Vitor",300);
        ContaCorrente contaCorrente = new ContaCorrente(2, "Vitor", 300, 500);
        ContaPoupanca contaPoupanca = new ContaPoupanca(3,"Vitor",0);
        ContaSalario contaSalario = new ContaSalario(4,"Vitor", 2000);

        System.out.println("------------------------------------------------------");
        System.out.println("Conta Bancária:");
        conta.depositar(200);
        conta.saque(100);
        conta.saque(500);
        conta.exibirSaldo();
        System.out.println("------------------------------------------------------");
        System.out.println("Conta corrente:");
        contaCorrente.depositar(200);
        contaCorrente.saque(100);
        contaCorrente.saque(500);
        contaCorrente.exibirSaldo();
        System.out.println("------------------------------------------------------");
        System.out.println("Conta Poupança:");
        contaPoupanca.depositar(500);
        contaPoupanca.saque(300);
        contaPoupanca.exibirSaldo();
        System.out.println("------------------------------------------------------");
        System.out.println("Conta Salário");
        contaSalario.saque(300);
        contaSalario.saque(2000);
        contaSalario.saque(300);
        contaSalario.exibirSaldo();
        System.out.println("------------------------------------------------------");
    }
}