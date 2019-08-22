package br.com.frwk;

import java.util.Scanner;

public class Exercicio03 {
    /*Peça para que o usuário informe o total de pontos obtidos
    com exercícios em sala pelo aluno.
    Somando a nota das provas, mais a nota dos exercícios,
    verifique se o aluno foi aprovado

    e apresente na tela seu status de aprovação,
    de acordo com a tabela abaixo:
    > 60 aprovado
    entre 50 e 59 recuperacao prova1
    entre 40 e 49 recuperacao prova2
    < 40 reprovado
    */

    public static void main(String[] args) {
        boolean novoAluno = true;

        while (novoAluno == true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("informe o nome do aluno");
            String nomeAluno = sc.nextLine();

            System.out.println("informe a turma");
            String turmaAluno = sc.nextLine();

            System.out.println("informe a pontuação da prova1");
            int prova1 = sc.nextInt();
            prova1 = prova1 * 2;

            System.out.println("informe a pontuação da prova2");
            int prova2 = sc.nextInt();

            System.out.println("informe a pontuação da prova3");
            int prova3 = sc.nextInt();

            System.out.println("pontuação obtida nos exercicios");
            int pontExerc = sc.nextInt();

            int total = prova1 + prova2 + prova3 + pontExerc;
            if (total > 100) {
                total = 100;
            }

            System.out.println(nomeAluno + " " + turmaAluno);

            if (total >= 60){
                System.out.println("total das provas e exercicios: " + total);
                System.out.println("Aprovado!");
            } else if (total > 49 && total < 60){
                System.out.println("total das provas e exercicios: " + total);
                System.out.println("Vai fazer a Prova1!");
            } else if (total > 39 && total < 50){
                System.out.println("total das provas e exercicios: " + total);
                System.out.println("Vai fazer a Prova2!");
            } else  {
                System.out.println("total das provas e exercicios: " + total);
                System.out.println("Vai fazer a RECUPERACAO10!");
            }

            String enter = sc.nextLine();

            System.out.println("Deseja registrar outro aluno ? (s/n)");
            char temp = sc.next().charAt(0);

            if (temp != 's'){
                novoAluno = false;
            }
        }
        System.out.println("saiu do while, fim!");
    }
}
