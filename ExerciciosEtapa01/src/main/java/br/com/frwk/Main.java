package br.com.frwk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("informe a pontuação da prova1");
        int prova1 = sc.nextInt();

        System.out.println("informe a pontuação da prova2");
        int prova2 = sc.nextInt();

        System.out.println("informe a pontuação da prova3");
        int prova3 = sc.nextInt();

        int total = prova1 + prova2 + prova3;

        System.out.println("total das 3 provas: " +total);


    }
}
/*
* 1º Exercicio
Escreva um programa que receba a nota de três provas
* executadas durante o semestre e
* informe o total de pontos obtido.
* Sendo o total de pontos a soma dos pontos obtidos em cada uma  das provas individuais.

* */