package br.com.frwk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nomeAluno;
        String turmaAluno;
        Double notaProva1;
        Double notaProva2;
        Double notaProva3;
        Double notaExercicio;
        Double total;
        String status;

        List<Aluno> alunos = new ArrayList<Aluno>();

        int y = 0;
        while(y == 0){
            System.out.println("Digite o nome do aluno: ");
            nomeAluno = ler.nextLine();

            System.out.println("Digite a turma do aluno: ");
            turmaAluno = ler.nextLine();

            System.out.println("Digite a nota da prova 1: ");
            notaProva1 = ler.nextDouble();

            System.out.println("Digite a nota da prova 2: ");
            notaProva2 = ler.nextDouble();

            System.out.println("Digite a nota da prova 3: ");
            notaProva3 = ler.nextDouble();

            System.out.println("Digite a nota dos exercicios: ");
            notaExercicio = ler.nextDouble();

            total = notaProva1 + notaProva2 + notaProva3 + notaExercicio;

            if (total >= 60){
                status = "Aprovado";
            } else if (total > 49 && total < 60){
                status = "Recuperacao";
            } else if (total > 39 && total < 50){
                status = "Recuperacao";
            } else  {
                status = "Reprovado";
            }

            Aluno aluno = new Aluno(nomeAluno, turmaAluno, notaProva1, notaProva2, notaProva3, notaExercicio, total, status);

            alunos.add(aluno);

            //perguntar se quer cadastrar outro aluno
            System.out.println("Voce quer cadastrar outro aluno ? 1 para sim e 2 para não: ");
            int outroAluno = ler.nextInt();
            if (outroAluno != 1){
                y = 1;
            }

            String limpar = ler.nextLine();
        }

        //aponte quem foi o destaque da turma (aluno com melhor total geral),
        Double maiorNota = 0.0;
        String nomeAlunoMaiorTotal = "";
        for (Aluno aluno : alunos) {
            if (maiorNota < aluno.getTotal()){
                maiorNota = aluno.getTotal();
                nomeAlunoMaiorTotal = aluno.getNomeAluno();
            }
        }
        System.out.println(nomeAlunoMaiorTotal + " " + maiorNota);

        //quem foi o destaque em sala de aula (aluno com melhor nota em exercícios em sala),
        Double maiorNotaExerc = 0.0;
        String nomeAlunoMaiorExerc = "";
        for (Aluno aluno : alunos) {
            if (maiorNotaExerc < aluno.getNotaExercicio()){
                maiorNotaExerc = aluno.getNotaExercicio();
                nomeAlunoMaiorExerc = aluno.getNomeAluno();
            }
        }
        System.out.println(nomeAlunoMaiorExerc + " " + maiorNotaExerc);

        //e a relação de nomes e notas de alunos reprovados.
        for (Aluno aluno : alunos) {
            if (aluno.getStatus() == "Reprovado"){
                System.out.println(aluno.getNomeAluno());
                System.out.println(aluno.getTotal());
            }
        }
    }
}
