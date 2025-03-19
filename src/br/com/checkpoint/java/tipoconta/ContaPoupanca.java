package br.com.checkpoint.java.tipoconta;

import br.com.checkpoint.java.ContaBancaria;

public class ContaPoupanca  extends ContaBancaria {

    //CONTRUTOR DA SUB CLASSE
    public ContaPoupanca(int numeroConta, String nomeTitular, double saldo) {
        super(numeroConta, nomeTitular, saldo);
    }

    //MODIFICANDO O MÉTODO EXIBIR SALDO COM O RENDIMENTO MENSAL DO CLIENTE
    @Override
    public void exibirSaldo() {
        double rendimento = 0.05 * this.saldo;
        System.out.println("Seu saldo atual é: R$" + (this.saldo + rendimento));
        System.out.println("O seu rendimento nesse mês foi de R$" + rendimento);
    }
}
