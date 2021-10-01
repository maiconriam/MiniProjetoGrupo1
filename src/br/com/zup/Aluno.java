package br.com.zup;

public class Aluno extends Pessoa{
    private double alturaAluno;
    private double pesoAluno;

    public Aluno(){
    }

    public Aluno(String nome, String cpf, double alturaAluno, double pesoAluno) {
        super(nome, cpf);
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

        retorno.append("\n Nome do aluno: " + getNome());
        retorno.append("\n CPF do aluno: " + getCpf());
        retorno.append("\n Altura do aluno: " + alturaAluno);
        retorno.append("\n Peso do aluno: " + pesoAluno);
        return retorno.toString();
    }
}