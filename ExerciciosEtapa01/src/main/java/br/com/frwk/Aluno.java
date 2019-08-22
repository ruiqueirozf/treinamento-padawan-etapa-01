package br.com.frwk;

import com.sun.deploy.panel.IProperty;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.awt.*;

/*Junto ao resumo do exercício anterior,
aponte quem foi o destaque da turma (aluno com melhor total geral),
quem foi o destaque em sala de aula (aluno com melhor nota em exercícios em sala),
e a relação de nomes e notas de alunos reprovados.
*/
public class Aluno {
        private String nomeAluno;
        private String turmaAluno;
        private Double notaProva1;
        private Double notaProva2;
        private Double notaProva3;
        private Double notaExercicio;
        private Double total;
        private String status;

    public Aluno(String aNomeAluno, String aTurmaAluno, Double aNotaProva1, Double aNotaProva2,
                 Double aNotaProva3, Double aNotaExercicio, Double aTotal, String aStatus) {
        this.nomeAluno = aNomeAluno;
        this.turmaAluno = aTurmaAluno;
        this.notaProva1 = aNotaProva1;
        this.notaProva2 = aNotaProva2;
        this.notaProva3 = aNotaProva3;
        this.notaExercicio = aNotaExercicio;
        this.total = aTotal;
        this.status = aStatus;
    }

/*
    public static Double somarTotal() {
        return aNotaProva1 + aNotaProva2 + aNotaProva3 + aNotaExercicio;
    }*/

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getTurmaAluno() {
        return turmaAluno;
    }

    public void setTurmaAluno(String turmaAluno) {
        this.turmaAluno = turmaAluno;
    }

    public Double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(Double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public Double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(Double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public Double getNotaProva3() {
        return notaProva3;
    }

    public void setNotaProva3(Double notaProva3) {
        this.notaProva3 = notaProva3;
    }

    public Double getNotaExercicio() {
        return notaExercicio;
    }

    public void setNotaExercicio(Double notaExercicio) {
        this.notaExercicio = notaExercicio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
