package br.com.checkpoint.java;

public class ContaBancaria {

    //CRIANDO OS ATRIBUTOS DA CLASSE

    private int numeroConta;
    private String nomeTitular;
    protected double saldo;

    //CRIANDO UM CONSTRUTOR PARA A SUPER CLASSE
    public ContaBancaria(int numeroConta, String nomeTitular, double saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    //CRIANDO O MÉTODO DEPOSITAR
    public void depositar(double valor){
        if(valor <= 0 ){
            System.out.println("Valor inválido");
        }else{
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " feito, saldo atual: R$" + saldo);
        }
    }

    //CRIANDO O MÉTODO SAQUE
    public void saque(int valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente para esse saque, seu valor em conta é de R$" + saldo);
        }else{
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " efetuado, valor em conta: R$" + saldo);
        }
    }

    //CRIANDO O MÉTODO EXIBIR SAQUE
    public void exibirSaldo(){
        System.out.println("Saldo atual: R$" + this.saldo);
    }
}
