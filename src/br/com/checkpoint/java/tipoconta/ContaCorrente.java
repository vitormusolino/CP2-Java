package br.com.checkpoint.java.tipoconta;

import br.com.checkpoint.java.ContaBancaria;

public class ContaCorrente extends ContaBancaria {

    //CRIANDO UM CONSTRUTOR PARA SUB CLASSE COM O ATRIBUTO LIMITE
    public ContaCorrente(int numeroConta, String nomeTitular, double saldo, double limite) {
        super(numeroConta, nomeTitular, saldo);
        this.limite = limite;
    }

    //CRIANDO OS ATRIBUTOS LIMITE E TAXA DA SUB CLASSE
    private double limite;
    private double taxa = 0.01 * this.saldo;


    //ALTERANDO O MÉTODO SAQUE PARA TER A TAXA DE SAQUE
    @Override
    public void saque(int valor) {
        if(limite < valor){
            System.out.println("Limite excedido, seu limite é de R$" + limite);
        }else{
            this.saldo -= taxa;
            this.saldo -= valor;
            System.out.println("Saque bem suceedido, valor do saque R$" + valor + " , valor em conta R$" + this.saldo);
            System.out.println("Taxa sendo cobrada R$" + taxa + " valor total em conta R$" + this.saldo);
        }
    }
}
