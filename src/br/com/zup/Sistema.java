package br.com.zup;

import java.util.Scanner;

public class Sistema {

    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
}












    public static Aluno cadastrarAlunos() {
        String aluno = capturarDados("Digite o nome do aluno que deseja matricular!").nextLine();

        Aluno novoAluno = new Aluno();
        novoAluno.setAluno(aluno);
        return novoAluno;
    }