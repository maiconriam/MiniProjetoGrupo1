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

    public List<Horario> getHorario() {
        return horario;
    }

    public void setHorario(List<Horario> horario) {
        this.horario = horario;
    }

    public String getTipoDaAula() {
        return tipoDaAula;
    }

    public void setTipoDaAula(String tipoDaAula) {
        this.tipoDaAula = tipoDaAula;
    }

    public double getValorDaAula() {
        return valorDaAula;
    }

    public void setValorDaAula(double valorDaAula) {
        this.valorDaAula = valorDaAula;
    }
}
