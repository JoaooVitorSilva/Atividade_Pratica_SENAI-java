package br.com.senai.service;

import br.com.senai.view.PessoaView;
import br.com.senai.view.FuncionarioView;
import br.com.senai.view.EnderecoView;
import br.com.senai.view.ClienteView;

import java.util.Scanner;

public class MenuService {

    private Scanner tec = new Scanner(System.in);
    private boolean exec = true;

    private PessoaView pessoaView = new PessoaView();
    private FuncionarioView funcionarioView = new FuncionarioView();
    private EnderecoView enderecoView = new EnderecoView();
    private ClienteView clienteView = new ClienteView();

    public void menuPrincipal() {
        do {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1 - Pessoa");
            System.out.println("2 - Endereco");
            System.out.println("3 - Funcionario");
            System.out.println("4 - Cliente");
            System.out.println("9 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = tec.nextInt();
            tec.nextLine();

            switch (opcao) {
                case 1:
                    pessoaView.menu();
                    break;
                case 2:
                    enderecoView.menu();
                    break;
                case 3:
                    funcionarioView.menu();
                    break;
                case 4:
                    clienteView.menu();
                    break;
                case 9:
                    exec = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (exec);
    }
}
