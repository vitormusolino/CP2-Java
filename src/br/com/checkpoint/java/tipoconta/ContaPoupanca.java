package br.com.checkpoint.java.tipoconta;

import br.com.checkpoint.java.ContaBancaria;

public class ContaPoupanca  extends ContaBancaria {

    private double rendimentoMensal;

    public ContaPoupanca(int numeroConta, String nomeTitular, double saldo) {
        super(numeroConta, nomeTitular, saldo);
    }

    @Override
    public void exibirSaldo() {
        double rendimento = 0.05 * this.saldo;
        System.out.println("Seu saldo atual é: R$" + (this.saldo + rendimento));
        System.out.println("O seu rendimento nesse mês foi de R$" + rendimento);
    }
}
