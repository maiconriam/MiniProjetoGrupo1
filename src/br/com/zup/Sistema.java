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

    public static void executar() {
        Academia academia = new Academia();
        Horario horario1 = new Horario(11);
        Horario horario2 = new Horario(15);
        Horario horario3 = new Horario(10);

        Aula natacao = new Aula("Natação", 150);
        natacao.adicionarHorario(horario1);

        Aula ginastica = new Aula("Ginastica", 200);
        ginastica.adicionarHorario(horario2);

        Aula pilates = new Aula("Pilates", 300);
        pilates.adicionarHorario(horario3);

        PersonalTrainer joao = new PersonalTrainer("Joao", "293092039293", natacao);
        PersonalTrainer marcelo = new PersonalTrainer("Marcelo", "312039103913", ginastica);
        PersonalTrainer maria = new PersonalTrainer("Maria", "4983894983984", pilates);
    }
}