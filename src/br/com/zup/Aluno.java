package br.com.zup;

public class Aluno extends Pessoa{
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

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do aluno: " + getNome());
        retorno.append("\nCPF do aluno: " + getCpf());
        retorno.append("\nAltura do aluno: " + alturaAluno);
        retorno.append("\nPeso do aluno: " + pesoAluno);
        return retorno.toString();
    }
}
