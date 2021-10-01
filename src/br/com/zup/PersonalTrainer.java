package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class PersonalTrainer extends Pessoa {
    private Aula aulaMinistrada;
    private List<Aluno> alunos = new ArrayList<>();

    public PersonalTrainer() {

    }

    public PersonalTrainer(String nome, String cpf, Aula aulaMinistrada) {
        super(nome, cpf);
        this.aulaMinistrada = aulaMinistrada;
    }

    public Aula getAulaMinistrada() {
        return aulaMinistrada;
    }

    public void setAulaMinistrada(Aula aulaMinistrada) {
        this.aulaMinistrada = aulaMinistrada;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno novoaluno) {
        alunos.add(novoaluno);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Personal: " + getNome());
        retorno.append("\n CPF do Personal: " + getCpf());
        retorno.append("\n Aula Ministrada: " + aulaMinistrada.getTipoDaAula());
        retorno.append("\n Alunos: " + alunos);
        return retorno.toString();
    }
}