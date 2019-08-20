package br.com.frwk;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 7º Exercicio
Junto ao resumo do exercício anterior,
*  aponte quem foi o destaque da turma (aluno com melhor total geral),
*  quem foi o destaque em sala de aula (aluno com melhor nota em exercícios em sala),
*  e a relação de nomes e notas de alunos reprovados.
* */
public class Exercicio07 {
    public static void main(String[] args) {
        boolean novoAluno = true;
        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;
        int notaMaior = 0;
        String nomeMaiorTotalGeral = "";
        int maiorExerc = 0;
        String nomeMaiorExerc = "";

        ArrayList<String> alunosReprovados = new ArrayList();

        //lista de nomes e notas dos alunos reporvados

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

            if (total > notaMaior){
                notaMaior = total;
                nomeMaiorTotalGeral = nomeAluno;
            }

            if (pontExerc > maiorExerc){
                maiorExerc = pontExerc;
                nomeMaiorExerc = nomeAluno;
            }

            System.out.println(nomeAluno + " " + turmaAluno);
            if (total >= 60){
                aprovados = ++aprovados;
                System.out.println("total das provas e exercicios: " + total);
                System.out.println("Aprovado!");
            } else if (total > 49 && total < 60){
                System.out.println("total das provas e exercicios: " + total);
                System.out.println("Vai fazer a Prova1!");
                recuperacao = ++recuperacao;
            } else if (total > 39 && total < 50){
                System.out.println("total das provas e exercicios: " + total);
                System.out.println("Vai fazer a Prova2!");
                recuperacao = ++recuperacao;
            } else  {
                System.out.println("total das provas e exercicios: " + total);
                System.out.println("Vai fazer a RECUPERACAO10!");
                reprovados = ++reprovados;

                alunosReprovados.add(nomeAluno);
            }

            String enter = sc.nextLine();

            System.out.println("Deseja registrar outro aluno ? (s/n)");
            char temp = sc.next().charAt(0);

            if (temp != 's'){
                novoAluno = false;
            }
        }
        System.out.println("saiu do while, fim!");
        System.out.println("numero de alunos aprovados: " + aprovados);
        System.out.println("numero de alunos em recuperacao: " + recuperacao);
        System.out.println("numero de alunos reprovados: " + reprovados);
        System.out.println("Nome da maior nota total geral: " + nomeMaiorTotalGeral);
        System.out.println("Nome da maior nota em exercicios: " + nomeMaiorExerc);
        System.out.println(alunosReprovados);
    }
}
