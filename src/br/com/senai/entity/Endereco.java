package br.com.senai.entity;

public class Endereco {

    //ATRIBUTOS
    private String rua;
    private String cidade;
    private String bairro;
    private String pais;
    private String estado;
    private String cep;

    //CONSTRUTORES

    public Endereco() {

    }

    public Endereco(String rua, String cidade, String bairro, String pais, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.bairro = bairro;
        this.pais = pais;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
