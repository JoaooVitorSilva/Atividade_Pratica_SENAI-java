package br.com.senai.service;

import br.com.senai.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private Cliente cliente;

    public Cliente cadastrarCliente(String nomeCliente, String sexoCliente, int idadeCliente, String cpfCliente){
        cliente = new Cliente(nomeCliente, sexoCliente, idadeCliente, cpfCliente);

        cliente.setSexoCliente(sexoCliente);
        cliente.setIdadeCliente(idadeCliente);
        cliente.setCpfCliente(cpfCliente);

        return cliente;
    }

    public List<Cliente> listarCliente(List<Cliente> clientes){
        return clientes;

    }

    public Cliente buscarCliente(List<Cliente> client, int id){
        if (id >= client.size() || id < 0){
            System.out.println("Cliente não encontrado!!! ");
        }
        return client.get(id);
    }

    public List<Cliente> editarCliente(List<Cliente> client, Cliente clienteNovo, int id){
        client.set(id, clienteNovo);
        return client;
    }

    public void removerCliente(List<Cliente> clientes, int id){
        clientes.remove(id);

    }

}
