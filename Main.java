package org.example;

public class Main {
    public static void main(String[] args) {
        Turma t = new Turma();

        Aluno a1 = new Aluno("Tiago", "11", new double[]{7.0, 8.5});
        Aluno a2 = new Aluno("Ana", "22", new double[]{9.0, 10.0});
        Aluno a3 = new Aluno("Lucas", "33", new double[]{5.0, 4.5});

        t.adicionarAluno(a1);
        t.adicionarAluno(a2);
        t.adicionarAluno(a3);

        System.out.println("Alunos:");
        t.listarAlunos();

        Aluno melhor = t.buscarMelhorAluno();
        System.out.println("Melhor aluno: " + melhor.nome);
        System.out.println("Media: " + melhor.calculaMedia());
    }
}