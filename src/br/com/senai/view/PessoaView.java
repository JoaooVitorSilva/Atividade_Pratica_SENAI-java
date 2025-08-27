package br.com.senai.view;

import br.com.senai.entity.Pessoa;
import br.com.senai.service.PessoaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaView {

    private Scanner tec = new Scanner(System.in);
    private boolean exec = true;
    private PessoaService pessoaService = new PessoaService();
    private List<Pessoa> pessoas = new ArrayList<>();

    public void menu() {
        do {
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Listar Pessoas");
            System.out.println("3 - Buscar Pessoa");
            System.out.println("4 - Remover Pessoa");
            System.out.println("5 - Editar Pessoa");
            System.out.println("9 - Voltar/Encerrar");

            System.out.print("Informe a opção desejada: ");
            executarMetodo(tec.nextInt());

        } while (exec);
    }

    private void executarMetodo(int opcao) {
        tec.nextLine();  // Consumir \n pendente

        switch (opcao) {
            case 1:
                System.out.print("Informe o nome da pessoa: ");
                String nome = tec.nextLine();

                System.out.print("Informe o sexo da pessoa: ");
                String sexo = tec.nextLine();

                System.out.print("Informe a idade da pessoa: ");
                int idade = tec.nextInt();
                tec.nextLine();

                System.out.print("Informe o CPF da pessoa: ");
                int cpf = tec.nextInt();
                tec.nextLine();

                Pessoa pessoa = pessoaService.cadastrarPessoa(nome, sexo, idade, cpf);
                pessoas.add(pessoa);
                System.out.println("Pessoa cadastrada com sucesso!");
                break;

            case 2:
                listarPessoas();
                break;

            case 3:
                buscarPessoa();
                break;

            case 4:
                removerPessoa();
                break;

            case 5:
                editarPessoa();
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

    private void listarPessoas() {
        System.out.println("--- PESSOAS CADASTRADAS ---");
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            System.out.printf("%d: %s | %s | %d anos | CPF: %d\n", i, p.getNome(), p.getSexo(), p.getIdade(), p.getCpf());
        }
    }

    private void buscarPessoa() {
        System.out.print("Informe o ID da pessoa: ");
        int id = tec.nextInt();
        tec.nextLine();

        Pessoa p = pessoaService.buscarPessoa(pessoas, id);
        if (p != null) {
            System.out.printf("Pessoa encontrada: %s | %s | %d anos | CPF: %d\n", p.getNome(), p.getSexo(), p.getIdade(), p.getCpf());
        }
    }

    private void removerPessoa() {
        System.out.print("Informe o ID da pessoa para remover: ");
        int id = tec.nextInt();
        tec.nextLine();

        pessoaService.removerPessoa(pessoas, id);
        System.out.println("Pessoa removida, se o ID era válido.");
    }

    private void editarPessoa() {
        System.out.print("Informe o ID da pessoa para editar: ");
        int id = tec.nextInt();
        tec.nextLine();

        if (id < 0 || id >= pessoas.size()) {
            System.out.println("Pessoa não encontrada!");
            return;
        }

        Pessoa pessoaNova = new Pessoa();

        System.out.print("Informe o nome da pessoa: ");
        pessoaNova.setNome(tec.nextLine());

        System.out.print("Informe o sexo da pessoa: ");
        pessoaNova.setSexo(tec.nextLine());

        System.out.print("Informe a idade da pessoa: ");
        pessoaNova.setIdade(tec.nextInt());
        tec.nextLine();

        System.out.print("Informe o CPF da pessoa: ");
        pessoaNova.setCpf(tec.nextInt());
        tec.nextLine();

        pessoas.set(id, pessoaNova);
        System.out.println("Pessoa editada com sucesso!");
    }
}
