package br.com.zup;

import java.util.*;

public class Sistema {
    static List<PersonalTrainer> pt = new ArrayList<>();

    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu(){
        System.out.println("Digite 1: Para adicionar um aluno");
        System.out.println("Digite 2: Para ver lista");
        System.out.println("Digite 3: Para sair do programa");
    }

    public static Aluno cadastrarAlunos() {
        String nome = capturarDados("Digite o nome do aluno").nextLine();
        String cpf = capturarDados("Digite o cpf do aluno").nextLine();
        double altura = capturarDados("Digite a altura do aluno").nextDouble();
        double peso = capturarDados("Digite o peso do aluno").nextDouble();

        Aluno novoAluno = new Aluno(nome, cpf, altura, peso);
        return novoAluno;
    }

    public static void carregarDados(){
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

        pt.add(joao);
        pt.add(marcelo);
        pt.add(maria);
    }

    public static Aula selecionarAula(){
        int index = 1;
        for (PersonalTrainer personal : pt){
            Aula aulaMinistrada = personal.getAulaMinistrada();
            System.out.println(personal.getAulaMinistrada().getTipoDaAula());
            for (Horario horario : aulaMinistrada.getHorario()) {
                System.out.println("[" + index + "] " + horario.getHorario() + ":00 Professor: " + personal.getNome());
                index++;
            }
        }
        int escolha = capturarDados("Digite a sua escolha").nextInt();
        Aula aula = pt.get(escolha - 1).getAulaMinistrada();
        Aluno aluno = cadastrarAlunos();
        pt.get(escolha -1).adicionarAluno(aluno);

        return aula;
    }

    public static void executar() {
        carregarDados();
        boolean menu = true;
        int escolhaMenu;

        while (menu){
            menu();
            escolhaMenu = capturarDados("Digite a sua escolha").nextInt();
            switch (escolhaMenu){
                case 1:
                    selecionarAula();
                    break;
                case 2:
                    System.out.println(pt);
                    break;
                case 3:
                    System.out.println("Programa finalizado");
                    menu = false;
                    break;
            }
        }
    }
}
