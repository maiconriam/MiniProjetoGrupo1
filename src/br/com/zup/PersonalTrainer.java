package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class PersonalTrainer {
    private int qtdDeAula;
    private Aula aulaMinistrada;
    private List<Aluno> alunos = new ArrayList<>();

    public PersonalTrainer() {

    }

    public PersonalTrainer(int qtdDeAula, Aula aulaMinistrada) {
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

}
