package br.com.senai.view;

import br.com.senai.entity.Cliente;
import br.com.senai.service.ClienteService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ClienteView {

    private Scanner tec = new Scanner(System.in);
    private boolean exec = true;
    private ClienteService clienteService = new ClienteService();
    private List<Cliente> client = new ArrayList<>();

    public void menu() {
        do {
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Buscar Cliente");
            System.out.println("4 - Remover Cliente");
            System.out.println("5 - Editar Cliente");
            System.out.println("9 - Encerrar o sistema");

            System.out.print("Informe a opção desejada: ");
            executarMetodo(tec.nextInt());

        } while (this.exec);
    }

    private void executarMetodo(int opcao) {
        tec.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Informe o nome do cliente: ");
                String nomeCliente = tec.nextLine();

                System.out.print("Informe o sexo do cliente: ");
                String sexoCliente = tec.nextLine();

                System.out.print("Informe a idade do cliente: ");
                int idadeCliente = tec.nextInt();
                tec.nextLine(); // consumir \n

                System.out.print("Informe o cpf do cliente: ");
                String cpfCliente = tec.nextLine();

                Cliente cliente = clienteService.cadastrarCliente(nomeCliente, sexoCliente, idadeCliente, cpfCliente);
                client.add(cliente);
                System.out.println("Cliente cadastrado com sucesso!");
                break;

            case 2:
                listarClientes(client);
                break;

            case 3:
                buscarCliente();
                break;

            case 4:
                removerCliente();
                break;

            case 5:
                editarCliente();
                break;

            case 9:
                this.exec = false;
                System.out.println("Sistema finalizado ...");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private void listarClientes(List<Cliente> clientes) {
        System.out.println("--- CLIENTES CADASTRADOS ---");
        System.out.printf("%-15s | %-6s | %-5s | %-15s \n", "NOME", "SEXO", "IDADE", "CPF");
        for (Cliente c : clientes) {
            System.out.printf("%-15s | %-6s | %-5d | %-15s \n",
                    c.getNomeCliente(),
                    c.getSexoCliente(),
                    c.getIdadeCliente(),
                    c.getCpfCliente());
        }
    }

    private void buscarCliente() {
        System.out.print("Informe o ID do cliente: ");
        int id = tec.nextInt();
        tec.nextLine();

        if (id < 0 || id >= client.size()) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        Cliente c = client.get(id);
        System.out.printf("Cliente encontrado: %s, %s, %d anos, CPF: %s\n",
                c.getNomeCliente(), c.getSexoCliente(), c.getIdadeCliente(), c.getCpfCliente());
    }

    private void removerCliente() {
        System.out.print("Informe o ID do cliente para remover: ");
        int id = tec.nextInt();
        tec.nextLine();

        if (id < 0 || id >= client.size()) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        client.remove(id);
        System.out.println("Cliente removido com sucesso!");
    }

    private void editarCliente() {
        System.out.print("Informe o ID do cliente para editar: ");
        int id = tec.nextInt();
        tec.nextLine();

        if (id < 0 || id >= client.size()) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        Cliente clienteNovo = new Cliente();

        System.out.print("Informe o novo nome do cliente: ");
        clienteNovo.setNomeCliente(tec.nextLine());

        System.out.print("Informe o novo sexo do cliente: ");
        clienteNovo.setSexoCliente(tec.nextLine());

        System.out.print("Informe a nova idade do cliente: ");
        clienteNovo.setIdadeCliente(tec.nextInt());
        tec.nextLine();

        System.out.print("Informe o novo CPF do cliente: ");
        clienteNovo.setCpfCliente(tec.nextLine());

        client.set(id, clienteNovo);
        System.out.println("Cliente editado com sucesso!");
    }
}
