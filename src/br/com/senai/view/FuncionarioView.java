package br.com.senai.view;

import br.com.senai.entity.Funcionario;
import br.com.senai.service.FuncionarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioView {

    private Scanner tec = new Scanner(System.in);
    private boolean exec = true;
    private FuncionarioService funcionarioService = new FuncionarioService();
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void menu() {
        do {
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Listar Funcionários");
            System.out.println("3 - Buscar Funcionário");
            System.out.println("4 - Remover Funcionário");
            System.out.println("5 - Editar Funcionário");
            System.out.println("9 - Voltar/Encerrar");

            System.out.print("Informe a opção desejada: ");
            executarMetodo(tec.nextInt());

        } while (exec);
    }

    private void executarMetodo(int opcao) {
        tec.nextLine();  // Consumir o '\n' pendente após nextInt()

        switch (opcao) {
            case 1:
                System.out.print("Informe o nome do funcionário: ");
                String nomeFuncionario = tec.nextLine();

                System.out.print("Informe o sexo do funcionário: ");
                String sexoFuncionario = tec.nextLine();

                System.out.print("Informe a idade do funcionário: ");
                int idadeFuncionario = tec.nextInt();
                tec.nextLine();  // Consumir o '\n' após nextInt()

                System.out.print("Informe o CPF do funcionário: ");
                String cpfFuncionario = tec.nextLine();

                System.out.print("Informe o salário do funcionário: ");
                double salario = tec.nextDouble();
                tec.nextLine();  // Consumir o '\n' após nextDouble()

                Funcionario funcionario = funcionarioService.cadastrarFuncionario(
                        nomeFuncionario, sexoFuncionario, idadeFuncionario, cpfFuncionario, salario);
                funcionarios.add(funcionario);
                System.out.println("Funcionário cadastrado com sucesso!");
                break;

            case 2:
                listarFuncionarios();
                break;

            case 3:
                buscarFuncionario();
                break;

            case 4:
                removerFuncionario();
                break;

            case 5:
                editarFuncionario();
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

    private void listarFuncionarios() {
        System.out.println("--- FUNCIONÁRIOS CADASTRADOS ---");
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            System.out.printf("%d: %s | %s | %d anos | CPF: %s | Salário: R$ %.2f\n",
                    i, f.getNomeFuncionario(), f.getSexoFuncionario(), f.getIdadeFuncionario(),
                    f.getCpfFuncionario(), f.getSalario());
        }
    }

    private void buscarFuncionario() {
        System.out.print("Informe o ID do funcionário: ");
        int id = tec.nextInt();
        tec.nextLine();

        Funcionario f = funcionarioService.buscarFuncionario(funcionarios, id);
        if (f != null) {
            System.out.printf("Funcionário encontrado: %s | %s | %d anos | CPF: %s | Salário: R$ %.2f\n",
                    f.getNomeFuncionario(), f.getSexoFuncionario(), f.getIdadeFuncionario(),
                    f.getCpfFuncionario(), f.getSalario());
        } else {
            System.out.println("Funcionário não encontrado!");
        }
    }

    private void removerFuncionario() {
        System.out.print("Informe o ID do funcionário para remover: ");
        int id = tec.nextInt();
        tec.nextLine();

        funcionarioService.removerFuncionario(funcionarios, id);
        System.out.println("Funcionário removido, se o ID era válido.");
    }

    private void editarFuncionario() {
        System.out.print("Informe o ID do funcionário para editar: ");
        int id = tec.nextInt();
        tec.nextLine();

        if (id < 0 || id >= funcionarios.size()) {
            System.out.println("Funcionário não encontrado!");
            return;
        }

        Funcionario funcionarioNovo = new Funcionario();

        System.out.print("Informe o nome do funcionário: ");
        funcionarioNovo.setNomeFuncionario(tec.nextLine());

        System.out.print("Informe o sexo do funcionário: ");
        funcionarioNovo.setSexoFuncionario(tec.nextLine());

        System.out.print("Informe a idade do funcionário: ");
        funcionarioNovo.setIdadeFuncionario(tec.nextInt());
        tec.nextLine();  // Consumir '\n' após nextInt()

        System.out.print("Informe o CPF do funcionário: ");
        funcionarioNovo.setCpfFuncionario(tec.nextLine());

        System.out.print("Informe o salário do funcionário: ");
        funcionarioNovo.setSalario(tec.nextDouble());
        tec.nextLine();  // Consumir '\n' após nextDouble()

        funcionarios.set(id, funcionarioNovo);
        System.out.println("Funcionário editado com sucesso!");
    }
}
