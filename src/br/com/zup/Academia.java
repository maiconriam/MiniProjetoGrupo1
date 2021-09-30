package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Aula> aulas = new ArrayList<>();
    private List<PersonalTrainer> personalTrainers = new ArrayList<>();

    public void adicionarPersonal(String nome){
        personalTrainers.add(nome);
    }

    public void adicionarAula(String nomeDaAula){
        aulas.add(nomeDaAula);
    }
}
