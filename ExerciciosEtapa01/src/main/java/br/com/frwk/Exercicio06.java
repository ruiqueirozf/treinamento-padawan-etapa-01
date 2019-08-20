package br.com.frwk;

import java.util.Scanner;

public class Exercicio06 {
    /*Quando o usuário informar que não deseja mais processar
     a nota de nenhum aluno.
      Exiba um resumo dizendo o total de alunos que foram aprovados,
       que estão em recuperação, e que foram reprovados.
     */
    public static void main(String[] args) {
        boolean novoAluno = true;
        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

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
    }
}
