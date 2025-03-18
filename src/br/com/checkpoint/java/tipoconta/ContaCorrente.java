package br.com.checkpoint.java.tipoconta;

import br.com.checkpoint.java.ContaBancaria;

public class ContaCorrente extends ContaBancaria {

    private double limite;


    public ContaCorrente(int numeroConta, String nomeTitular, double saldo, double limite) {
        super(numeroConta, nomeTitular, saldo);
        this.limite = limite;
    }

    @Override
    public void saque(int valor) {
        if(limite < valor){
            System.out.printf("Limite excedido, seu limite é de R$" + limite);
        }else{
            super.saque(valor);
        }
    }
}
