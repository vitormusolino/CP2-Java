package br.com.checkpoint.java.tipoconta;

import br.com.checkpoint.java.ContaBancaria;

public class ContaPoupanca  extends ContaBancaria {

    private double rendimentoMensal;

    public ContaPoupanca(int numeroConta, String nomeTitular, double saldo) {
        super(numeroConta, nomeTitular, saldo);
    }

    public void consultarRendimento(int mes){
        double rendimentoTotal;
        double rendimento = 0.1 * getSaldo();

        if(mes == 0 || mes > 12){
            System.out.println("Mês inválido");
        }else{
            rendimentoTotal = (rendimento * mes) + getSaldo();
            System.out.println("O seu rendimento em " + mes + " meses foi de R$" + rendimento);
            System.out.println("O valor total na sua conta é de R$" + rendimentoTotal);
        }

    }
}
