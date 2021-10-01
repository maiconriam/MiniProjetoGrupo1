package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    static List<PersonalTrainer> pt = new ArrayList<>();

    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static Aluno cadastrarAlunos() {
        String nome = capturarDados("Digite o nome do aluno").nextLine();
        String cpf = capturarDados("Digite o cpf do aluno").nextLine();
        double altura = capturarDados("Digite a altura do aluno").nextDouble();
        double peso = capturarDados("Digite o peso do aluno").nextDouble();

        Aluno novoAluno = new Aluno(nome, cpf, altura, peso);
        return novoAluno;
    }


}