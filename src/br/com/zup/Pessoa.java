package br.com.zup;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa() {

    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome: " + nome);
        retorno.append("\n Cpf: " + cpf);
        return retorno.toString();
    }
}