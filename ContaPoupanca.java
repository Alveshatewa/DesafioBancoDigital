package DesafioBancoDigital;

import java.util.Scanner;

/**
 *
 * @author Alves Hatewa
 */
public class ContaPoupanca extends Banco {

       //Escopo para variáveis, instâncias e objectos
    Scanner ler = new Scanner(System.in);
    private Cliente cliente;
    private double saldo;
    private int numeroConta;
    private double valorSaque;
    private String opcao;

    public ContaPoupanca(Cliente cliente, String agencia, String tipoConta, double saldoConta) {
        super(cliente, agencia, tipoConta, saldoConta);
    }

    @Override
    public void consultarSaldo() {

        System.out.println("O seu saldo é de: " + this.saldo + "\n Saldo disponível em: \n"
                + super.dataFormatada);

    }

    @Override
    public void depositar(double valorDeposito) {

        this.saldo +=  valorDeposito * ( valorDeposito + 10/100);
        System.out.println("Operação realizada com sucesso!");

    }

    @Override
    public void sacar() {

        if (valorSaque > this.saldo) {

            System.out.println("Saldo insuficiente para realizar a operação!");

        } else {
            this.saldo -= valorSaque;

            System.out.println("Operação realizada com sucesso!");

            imprimirRecibo();
        }

    }

    @Override
    public void transferirSaldo(double valorTransferencia) {

        System.out.println("Quanto pretende transferir?");
        valorTransferencia = ler.nextDouble();

        if (!(this.saldo == 0)) {

            if (valorTransferencia > this.saldo) {
                System.out.println("Lamentamos. \n Mas o seu saldo não lhe permite realizar a operação.");

            } else {

                this.saldo -= valorTransferencia;
                
                imprimirRecibo();

            }
        }

    }

    public void imprimirRecibo() {

        System.out.println("Deseja imprimir um recibo?");
        System.out.println("Sim");
        System.out.println("Nao");
        opcao = ler.nextLine();

        if (!opcao.equalsIgnoreCase("Nao")) {

            System.out.println("========== DADOS DA OPERAÇÃO ==========");
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Valor de saque: " + valorSaque);
            System.out.println("Saldo contabilistico em " + super.dataFormatada + " : "
                    + this.saldo);

        } else {
            // nada por fazer ainda...
        }

    }

}
