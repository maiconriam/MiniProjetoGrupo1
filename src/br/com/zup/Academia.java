package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Aula> aulas = new ArrayList<>();
    private List<PersonalTrainer> personalTrainers = new ArrayList<>();

    public void adicionarPersonal(PersonalTrainer nome){
        personalTrainers.add(nome);
    }

    public void adicionarAula(Aula nomeDaAula){
        aulas.add(nomeDaAula);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Personal Trainers: " + personalTrainers);
        retorno.append("Aulas: " + aulas);
        return retorno.toString();
    }
}
