package br.com.zup;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Sistema {

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

    public static PersonalTrainer personal1(){
        PersonalTrainer personal1 = new PersonalTrainer();
        return personal1;
    }

    public static PersonalTrainer personal2(){
        PersonalTrainer personal1 = new PersonalTrainer();
        return personal1;
    }

    public static PersonalTrainer personal3(){
        PersonalTrainer personal1 = new PersonalTrainer();
        return personal1;
    }

    public static PersonalTrainer personal4(){
        PersonalTrainer personal1 = new PersonalTrainer();
        return personal1;
    }

}