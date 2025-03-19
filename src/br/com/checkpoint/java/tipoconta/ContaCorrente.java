package br.com.checkpoint.java.tipoconta;

import br.com.checkpoint.java.ContaBancaria;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numeroConta, String nomeTitular, double saldo, double limite) {
        super(numeroConta, nomeTitular, saldo);
        this.limite = limite;
    }

    private double limite;
    private double taxa = 0.01 * this.saldo;




    @Override
    public void saque(int valor) {
        if(limite < valor){
            System.out.printf("Limite excedido, seu limite é de R$" + limite);
        }else{
            this.saldo -= taxa;
            System.out.println("Taxa sendo cobrada R$" + taxa);
            super.saque(valor);

        }
    }
}
