package br.com.zup;

import java.util.Scanner;

public class Sistema {

    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
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
