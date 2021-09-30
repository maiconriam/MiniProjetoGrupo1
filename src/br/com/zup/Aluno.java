package br.com.zup;

public class Aluno {
    private double alturaAluno;
    private double pesoAluno;

    public Aluno(){
    }

    public Aluno(double alturaAluno, double pesoAluno) {
        this.alturaAluno = alturaAluno;
        this.pesoAluno = pesoAluno;
    }

    public double getAlturaAluno() {
        return alturaAluno;
    }

    public void setAlturaAluno(double alturaAluno) {
        this.alturaAluno = alturaAluno;
    }

    public double getPesoAluno() {
        return pesoAluno;
    }

    public void setPesoAluno(double pesoAluno) {
        this.pesoAluno = pesoAluno;
    }
}
