package org.example;

public class Aluno {
    public String nome;
    public String matricula;
    public double[] notas;

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calculaMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public void mostraInfo() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Media: " + calculaMedia());
        System.out.println("-----------------");
    }
}