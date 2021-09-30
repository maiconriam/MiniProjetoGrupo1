package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private List<Horario> horario = new ArrayList<>();
    private String tipoDaAula;
    private double valorDaAula;

    public Aula() {

    }

    public Aula(List<Horario> horario, String tipoDaAula, double valorDaAula) {
        this.horario = horario;
        this.tipoDaAula = tipoDaAula;
        this.valorDaAula = valorDaAula;
    }
}
