package org.example;

public class Turma {
    public int quantidadeAlunos = 0;

    public Aluno[] alunos = new Aluno[10];

    public void adicionarAluno(Aluno aluno) {
        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
    }

    public void listarAlunos() {
        for (int i = 0; i < quantidadeAlunos; i++) {
            alunos[i].mostraInfo();
        }
    }

    public Aluno buscarMelhorAluno() {
        Aluno melhor = alunos[0];
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].calculaMedia() > melhor.calculaMedia()) {
                melhor = alunos[i];
            }
        }
        return melhor;
    }
}