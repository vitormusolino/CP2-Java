package br.com.checkpoint.java.tipoconta;

import br.com.checkpoint.java.ContaBancaria;

public class ContaSalario extends ContaBancaria {

    //CRIANDO UM ATRIBUTO SAQUE ÚNICO PARA A SUB CLASSE
    private boolean saqueUnico = false;

    //CRIANDO O CONSTRUTOR DA SUB CLASSE
    public ContaSalario(int numeroConta, String nomeTitular, double saldo) {
        super(numeroConta, nomeTitular, saldo);
    }

    //MODIFICANDO O MÉTODO SAQUE DA SUB CLASSE PARA O USUÁRIO PODER SACAR SOMENTE UMA VEZ
    @Override
    public void saque(int valor) {
        if(saqueUnico == false){
            this.saldo -= valor;
            System.out.println("Salário sacado com sucesso, o saque é no valor de R$" + valor);
            saqueUnico = true;
        }else{
            System.out.println("Você já sacou seu salário!");
        }


    }
}
