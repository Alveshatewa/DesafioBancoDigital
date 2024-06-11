
package DesafioBancoDigital;

/**
 *
 * @author Alves Hatewa
 */
public class Cliente {
    
    private String nome;
    private String endereco;
    private String telefone;
    private long numeroConta;

    public Cliente(String nome, String endereco, String telefone, long numeroConta) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", numeroConta=" + numeroConta + '}';
    }
    
    
    
}
