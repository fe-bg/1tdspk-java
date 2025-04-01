package br.com.fiap.cadastro.model;

public class Pessoa {

    private String nome;
    private String celular;
    private int idade;
    private String rg;
    private String cpf;

    //exemplo de construtor default (vazio de parâmetros)
    public Pessoa() {
        //posso ter instruções aqui dentro do construtor
        Endereco matriz = new Endereco();
        matriz.logradouro = "Av Lins de Vasconcelos";
    }

    public Pessoa(String nome, String celular, int idade, String rg, String cpf) {
        this.celular = celular;
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
        this.rg = rg;
    }
}
