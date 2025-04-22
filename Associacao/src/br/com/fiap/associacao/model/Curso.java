package br.com.fiap.associacao.model;

public class Curso {

    private String nome;
    private String disciplinas;
    private String coordenador;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria, String coordenador) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.coordenador = coordenador;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
