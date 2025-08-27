package br.com.senai.entity;

public class Pessoa {

    //ATRIBUTOS
    private String nome;
    private String sexo;
    private int idade;
    private int cpf;

    //CONSTRUTORES

    public Pessoa() {

    }

    public Pessoa(String nome, String sexo, int idade, int cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
