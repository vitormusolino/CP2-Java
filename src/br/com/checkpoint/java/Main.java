package br.com.checkpoint.java;

import br.com.checkpoint.java.tipoconta.ContaCorrente;
import br.com.checkpoint.java.tipoconta.ContaPoupanca;
import br.com.checkpoint.java.tipoconta.ContaSalario;

public class Main {
    public static void main(String[] args) {
        //CRIANDO OS TIPOS DE CONTAS DIFERENTES
        ContaCorrente contaCorrente = new ContaCorrente(2, "Vitor", 300, 500);
        ContaPoupanca contaPoupanca = new ContaPoupanca(3,"Vitor",0);
        ContaSalario contaSalario = new ContaSalario(4,"Vitor", 2000);


        System.out.println("------------------------------------------------------");
        //TESTANDO OS MÉTODOS NA CONTA CORRENTE
        System.out.println("Conta corrente:");
        contaCorrente.depositar(200);
        contaCorrente.saque(100);
        contaCorrente.saque(600);
        contaCorrente.exibirSaldo();
        System.out.println("------------------------------------------------------");
        //TESTANDO OS MÉTODOS NA CONTA POUPANÇA
        System.out.println("Conta Poupança:");
        contaPoupanca.depositar(500);
        contaPoupanca.saque(300);
        contaPoupanca.exibirSaldo();
        System.out.println("------------------------------------------------------");
        //TESTANDO OS MÉTODOS NA CONTA SALÁRIO
        System.out.println("Conta Salário");
        contaSalario.depositar(1000);
        contaSalario.saque(500);
        contaSalario.saque(2000);
        contaSalario.exibirSaldo();
        System.out.println("------------------------------------------------------");
    }
}