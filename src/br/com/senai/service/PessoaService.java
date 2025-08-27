package br.com.senai.service;

import br.com.senai.entity.Pessoa;
import java.util.List;

public class PessoaService {

    public Pessoa cadastrarPessoa(String nome, String sexo, int idade, int cpf) {
        return new Pessoa(nome, sexo, idade, cpf);
    }

    public List<Pessoa> listarPessoa(List<Pessoa> pessoas) {
        return pessoas;
    }

    public Pessoa buscarPessoa(List<Pessoa> pessoas, int id) {
        if (id < 0 || id >= pessoas.size()) {
            System.out.println("Pessoa não encontrada!");
            return null;
        }
        return pessoas.get(id);
    }

    public List<Pessoa> editarPessoa(List<Pessoa> pessoas, Pessoa pessoaNova, int id) {
        if (id < 0 || id >= pessoas.size()) {
            System.out.println("Pessoa não encontrada!");
            return pessoas;
        }
        pessoas.set(id, pessoaNova);
        return pessoas;
    }

    public void removerPessoa(List<Pessoa> pessoas, int id) {
        if (id < 0 || id >= pessoas.size()) {
            System.out.println("Pessoa não encontrada!");
            return;
        }
        pessoas.remove(id);
    }
}
