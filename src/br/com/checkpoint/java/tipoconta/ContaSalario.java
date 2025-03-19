package br.com.checkpoint.java.tipoconta;

import br.com.checkpoint.java.ContaBancaria;

public class ContaSalario extends ContaBancaria {

    public ContaSalario(int numeroConta, String nomeTitular, double saldo) {
        super(numeroConta, nomeTitular, saldo);
    }

    public void saqueUnico(int valor){
        if(valor > this.saldo){
            System.out.println("Você tem R$" +saldo+ " para sacar. Ou seu salário ja foi sacado ou você digitou o valor errado!");
        }else if(valor == this.saldo){
            super.saque(valor);
        }else{
            System.out.println("Só é possível sacar o valor de seu salário. R$" + this.saldo);
        }

    }
}
