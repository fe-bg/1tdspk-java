package br.com.fiap.cofasi.model;

import java.time.LocalDate;

public class Pet {

    private int id;
    private String nome;
    private String tipo;
    private LocalDate nascimento;
    private Cliente proprietario;

    private Servico serv1;
    private Servico serv2;
    private Servico serv3;

    public Pet(String nome, Cliente proprietario, String tipo) {
        this.nome = nome;
        this.proprietario = proprietario;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Servico getServ1() {
        return serv1;
    }

    public void setServ1(Servico serv1) {
        this.serv1 = serv1;
    }

    public Servico getServ2() {
        return serv2;
    }

    public void setServ2(Servico serv2) {
        this.serv2 = serv2;
    }

    public Servico getServ3() {
        return serv3;
    }

    public void setServ3(Servico serv3) {
        this.serv3 = serv3;
    }
}
