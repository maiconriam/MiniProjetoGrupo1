package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private List<Horario> horario = new ArrayList<>();
    private String tipoDaAula;
    private double valorDaAula;

    public Aula() {

    }

    public Aula(String tipoDaAula, double valorDaAula) {
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

    public void adicionarHorario(Horario novoHorario) {
        horario.add(novoHorario);
    }



    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Tipo de aula: " + tipoDaAula);
        retorno.append("\n Valor da aula: " + valorDaAula);
        return retorno.toString();
    }
}