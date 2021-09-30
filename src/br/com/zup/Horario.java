package br.com.zup;

public class Horario {
    private int horario;

    public Horario() {
    }

    public Horario(int horario) {
        this.horario = horario;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Horario da aula: " + horario);
        return retorno.toString();
    }

}
