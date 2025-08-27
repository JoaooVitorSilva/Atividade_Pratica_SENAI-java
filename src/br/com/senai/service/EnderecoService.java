package br.com.senai.service;

import br.com.senai.entity.Endereco;
import java.util.List;

public class EnderecoService {

    public Endereco cadastrarEndereco(String rua, String cidade, String bairro, String pais, String estado, String cep) {
        return new Endereco(rua, cidade, bairro, pais, estado, cep);
    }

    public List<Endereco> listarEndereco(List<Endereco> enderecos) {
        return enderecos;
    }

    public Endereco buscarEndereco(List<Endereco> enderecos, int id) {
        if (id < 0 || id >= enderecos.size()) {
            System.out.println("Endereço não encontrado!");
            return null;
        }
        return enderecos.get(id);
    }

    public List<Endereco> editarEndereco(List<Endereco> enderecos, Endereco enderecoNovo, int id) {
        if (id < 0 || id >= enderecos.size()) {
            System.out.println("Endereço não encontrado!");
            return enderecos;
        }
        enderecos.set(id, enderecoNovo);
        return enderecos;
    }

    public void removerEndereco(List<Endereco> enderecos, int id) {
        if (id < 0 || id >= enderecos.size()) {
            System.out.println("Endereço não encontrado!");
            return;
        }
        enderecos.remove(id);
    }
}
