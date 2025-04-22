package br.com.fiap.associacao.model;

public class Aluno {

    private String nome;
    private String turma;
    private int rm;
    private Curso curso;

    public Aluno(String nome, int rm) {
        this.nome = nome;
        this.rm = rm;
    }

    public Aluno(String nome, int rm, String turma) {
        this(nome, rm);
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
