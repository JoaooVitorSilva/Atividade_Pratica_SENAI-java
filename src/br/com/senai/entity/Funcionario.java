package br.com.senai.entity;

public class Funcionario {

    //ATRIBUTOS
    private String nomeFuncionario;
    private String sexoFuncionario;
    private int idadeFuncionario;
    private String cpfFuncionario;
    private double salario;

    //CONSTRUTORES

    public Funcionario() {

    }

    public Funcionario(String nomeFuncionario, String sexoFuncionario, int idadeFuncionario, String cpfFuncionario, double salario) {
        this.nomeFuncionario = nomeFuncionario;
        this.sexoFuncionario = sexoFuncionario;
        this.idadeFuncionario = idadeFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.salario = salario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getSexoFuncionario() {
        return sexoFuncionario;
    }

    public void setSexoFuncionario(String sexoFuncionario) {
        this.sexoFuncionario = sexoFuncionario;
    }

    public int getIdadeFuncionario() {
        return idadeFuncionario;
    }

    public void setIdadeFuncionario(int idadeFuncionario) {
        this.idadeFuncionario = idadeFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
