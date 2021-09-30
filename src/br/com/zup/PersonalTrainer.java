package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class PersonalTrainer extends Pessoa {
    private int qtdDeAula;
    private Aula aulaMinistrada;
    private List<Aluno> alunos = new ArrayList<>();

    public PersonalTrainer() {

    }

    public PersonalTrainer(String nome, String cpf, int qtdDeAula, Aula aulaMinistrada) {
        super(nome, cpf);
        this.qtdDeAula = qtdDeAula;
        this.aulaMinistrada = aulaMinistrada;
    }

    public int getQtdDeAula() {
        return qtdDeAula;
    }

    public void setQtdDeAula(int qtdDeAula) {
        this.qtdDeAula = qtdDeAula;
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

    public void adicionarAluno(Aluno novoaluno){
        alunos.add(novoaluno);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Personal: " + getNome());
        retorno.append("\nCPF do Personal: " + getCpf());
        retorno.append("\nQuantidade de Aula: " + qtdDeAula);
        retorno.append("\nAula Ministrada: " + aulaMinistrada.getTipoDaAula());
        retorno.append("\nAlunos: " + alunos);
        return retorno.toString();
    }
}
