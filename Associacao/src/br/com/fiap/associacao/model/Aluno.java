package br.com.fiap.associacao.model;

public class Aluno {

    //Substitua o atributo nome por uma associação com o objeto Pessoa.
    //Imagine que vc ja esta usando a classe Aluno com esses construtores
    //e os métodos. Vc não deverá apagar nenhum método e nenhum construtor,
    //acrescente métodos e construtor(es) para esse novo atributo e altere
    //os métodos que serão impactados por essa mudança.
    //private String nome;

    private Pessoa pessoa;
    private String turma;
    private int rm;
    private Curso curso;

    public Aluno(String nome, int rm) {
        //this.nome = nome;
        this.pessoa = new Pessoa();
        this.pessoa.setNome(nome);

        this.rm = rm;
    }

    public Aluno(String nome, int rm, String turma) {
        this(nome, rm);
        this.turma = turma;
    }

    public String getNome() {
        return pessoa.getNome();
    }

    public void setNome(String nome) {
        this.pessoa.setNome(nome);
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
