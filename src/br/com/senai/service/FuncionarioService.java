package br.com.senai.service;

import br.com.senai.entity.Funcionario;
import java.util.List;

public class FuncionarioService {

    public Funcionario cadastrarFuncionario(String nomeFuncionario, String sexoFuncionario, int idadeFuncionario, String cpfFuncionario, double salario) {
        return new Funcionario(nomeFuncionario, sexoFuncionario, idadeFuncionario, cpfFuncionario, salario);
    }

    public List<Funcionario> listarFuncionario(List<Funcionario> funcionarios) {
        return funcionarios;
    }

    public Funcionario buscarFuncionario(List<Funcionario> funcionarios, int id) {
        if (id < 0 || id >= funcionarios.size()) {
            System.out.println("Funcionário não encontrado!");
            return null;
        }
        return funcionarios.get(id);
    }

    public List<Funcionario> editarFuncionario(List<Funcionario> funcionarios, Funcionario funcionarioNovo, int id) {
        if (id < 0 || id >= funcionarios.size()) {
            System.out.println("Funcionário não encontrado!");
            return funcionarios;
        }
        funcionarios.set(id, funcionarioNovo);
        return funcionarios;
    }

    public void removerFuncionario(List<Funcionario> funcionarios, int id) {
        if (id < 0 || id >= funcionarios.size()) {
            System.out.println("Funcionário não encontrado!");
            return;
        }
        funcionarios.remove(id);
    }
}
