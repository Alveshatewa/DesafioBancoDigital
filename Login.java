package DesafioBancoDigital;

import java.util.Scanner;

/**
 *
 * @author Meira Hatewa
 */
public class Login {

    Scanner scanner = new Scanner(System.in);
    private final String user = "Funcionario";
    private final String password = "FuncionarioBanco";
    private String usuario;
    private String senha;

    public void logar() {
        
        System.out.println("========== BEM VINDO AO BANCO CENTRAR ==========");
        System.out.println("Informe o nome de usuário");
        usuario = scanner.nextLine();
        System.out.println("Informe a sua senha");
        senha = scanner.nextLine();
        
        if (!usuario.equals(user) && senha.equals(password)){
            
            System.out.println("Erro. \n Usuário ou senha inválidos!");
           
        } else{
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Funcionários");
            System.out.println("2. Abrir Conta Poupança");
            System.out.println("3. Abrir Conta Corrente");
            int opcao = scanner.nextInt(); 
            
            switch (opcao) {
                case 1:
                 // implementaçoes para cadastrar funcionários
                    break;
                    
                    case 2:
                    // implementaçoes para abrir conta poupança
                    break;
                    
                    case 3:
                    // implementaçoes para cabrur conta corrente
                    break;
                default:
                    throw new AssertionError("Opção invãlida!");
            }
        }

    }

}
