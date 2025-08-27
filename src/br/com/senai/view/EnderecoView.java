package br.com.senai.view;

import br.com.senai.entity.Endereco;
import br.com.senai.service.EnderecoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnderecoView {

    private Scanner tec = new Scanner(System.in);
    private boolean exec = true;
    private EnderecoService enderecoService = new EnderecoService();
    private List<Endereco> enderecos = new ArrayList<>();

    public void menu() {
        do {
            System.out.println("1 - Cadastrar Endereço");
            System.out.println("2 - Listar Endereços");
            System.out.println("3 - Buscar Endereço");
            System.out.println("4 - Remover Endereço");
            System.out.println("5 - Editar Endereço");
            System.out.println("9 - Voltar/Encerrar");

            System.out.print("Informe a opção desejada: ");
            executarMetodo(tec.nextInt());

        } while (exec);
    }

    private void executarMetodo(int opcao) {
        tec.nextLine();  // Consumir \n pendente

        switch (opcao) {
            case 1:
                System.out.print("Informe a rua: ");
                String rua = tec.nextLine();

                System.out.print("Informe a cidade: ");
                String cidade = tec.nextLine();

                System.out.print("Informe o bairro: ");
                String bairro = tec.nextLine();

                System.out.print("Informe o país: ");
                String pais = tec.nextLine();

                System.out.print("Informe o estado: ");
                String estado = tec.nextLine();

                System.out.print("Informe o CEP: ");
                String cep = tec.nextLine();

                Endereco endereco = enderecoService.cadastrarEndereco(rua, cidade, bairro, pais, estado, cep);
                enderecos.add(endereco);
                System.out.println("Endereço cadastrado com sucesso!");
                break;

            case 2:
                listarEnderecos();
                break;

            case 3:
                buscarEndereco();
                break;

            case 4:
                removerEndereco();
                break;

            case 5:
                editarEndereco();
                break;

            case 9:
                exec = false;
                System.out.println("Voltando...");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private void listarEnderecos() {
        System.out.println("--- ENDEREÇOS CADASTRADOS ---");
        for (int i = 0; i < enderecos.size(); i++) {
            Endereco e = enderecos.get(i);
            System.out.printf("%d: %s, %s, %s, %s, %s, CEP: %s\n",
                    i, e.getRua(), e.getCidade(), e.getBairro(), e.getPais(), e.getEstado(), e.getCep());
        }
    }

    private void buscarEndereco() {
        System.out.print("Informe o ID do endereço: ");
        int id = tec.nextInt();
        tec.nextLine();

        Endereco e = enderecoService.buscarEndereco(enderecos, id);
        if (e != null) {
            System.out.printf("Endereço encontrado: %s, %s, %s, %s, %s, CEP: %s\n",
                    e.getRua(), e.getCidade(), e.getBairro(), e.getPais(), e.getEstado(), e.getCep());
        }
    }

    private void removerEndereco() {
        System.out.print("Informe o ID do endereço para remover: ");
        int id = tec.nextInt();
        tec.nextLine();

        enderecoService.removerEndereco(enderecos, id);
    }

    private void editarEndereco() {
        System.out.print("Informe o ID do endereço para editar: ");
        int id = tec.nextInt();
        tec.nextLine();

        if (id < 0 || id >= enderecos.size()) {
            System.out.println("Endereço não encontrado!");
            return;
        }

        Endereco enderecoNovo = new Endereco();

        System.out.print("Informe a rua: ");
        enderecoNovo.setRua(tec.nextLine());

        System.out.print("Informe a cidade: ");
        enderecoNovo.setCidade(tec.nextLine());

        System.out.print("Informe o bairro: ");
        enderecoNovo.setBairro(tec.nextLine());

        System.out.print("Informe o país: ");
        enderecoNovo.setPais(tec.nextLine());

        System.out.print("Informe o estado: ");
        enderecoNovo.setEstado(tec.nextLine());

        System.out.print("Informe o CEP: ");
        enderecoNovo.setCep(tec.nextLine());

        enderecos.set(id, enderecoNovo);
        System.out.println("Endereço editado com sucesso!");
    }
}
