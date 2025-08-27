package br.com.senai.entity;

public class Cliente {

    //ATRIBUTOS
    private String nomeCliente;
    private String sexoCliente;
    private int idadeCliente;
    private String cpfCliente;

    //CONSTRUTORES

    public Cliente() {

    }

    public Cliente(String nomeCliente, String sexoCliente, int idadeCliente, String cpfCliente) {
        this.nomeCliente = nomeCliente;
        this.sexoCliente = sexoCliente;
        this.idadeCliente = idadeCliente;
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
}
