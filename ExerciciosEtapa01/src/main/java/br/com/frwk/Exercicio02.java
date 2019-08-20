package br.com.frwk;

import java.util.Scanner;

/*
2º Exercicio
Peça também para que o usuário informe o nome e a turma do aluno no exercício anterior
* */

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("informe o nome do aluno");
        String nomeAluno = sc.nextLine();

        System.out.println("informe a turma");
        String turmaAluno = sc.nextLine();

        System.out.println("informe a pontuação da prova1");
        int prova1 = sc.nextInt();

        System.out.println("informe a pontuação da prova2");
        int prova2 = sc.nextInt();

        System.out.println("informe a pontuação da prova3");
        int prova3 = sc.nextInt();

        int total = prova1 + prova2 + prova3;

        System.out.println(nomeAluno + " " + turmaAluno);
        System.out.println("total das 3 provas: " +total);


    }
}
