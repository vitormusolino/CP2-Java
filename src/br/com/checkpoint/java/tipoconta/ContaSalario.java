package br.com.checkpoint.java.tipoconta;

import br.com.checkpoint.java.ContaBancaria;

public class ContaSalario extends ContaBancaria {
        private boolean saqueUnico = false;


    public ContaSalario(int numeroConta, String nomeTitular, double saldo) {
        super(numeroConta, nomeTitular, saldo);
    }


    @Override
    public void saque(int valor) {
        if(saqueUnico == false){
            if(this.saldo < valor || this.saldo > valor){
                System.out.println("Valor errado, você tentou sacar R$" + valor + " mas seu salário é R$" + this.saldo);
            }else{
                this.saldo -= valor;
                System.out.println("Salário sacado com sucesso, o saque é no valor de R$" + valor);
                saqueUnico = true;
            }
        }else{
            System.out.println("Você já sacou seu salário!");
        }


    }
}
