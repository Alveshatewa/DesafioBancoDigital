package DesafioBancoDigital;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alves Hatewa
 */
public class Banco {

    protected static int sequencia = 0;
    protected String agencia;
    protected String tipoConta;
    protected List<Cliente> cliente;
    protected List<Funcionarios> funcionario;
    String dataFormatada;
    Date data = new Date();

    public Banco(Cliente cliente, String agencia, String tipoConta, double saldoConta) {
        this.cliente = new ArrayList();
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.sequencia++;
    }

    public void consultarSaldo() {

    }

    public void depositar(double valor) {

    }

    public void sacar() {

    }

    public void transferirSaldo(double valor) {

    }

    public void formatarData() {
        DateFormat dt = DateFormat.getDateInstance(DateFormat.FULL);
        dataFormatada = dt.format(data);
    }

}
