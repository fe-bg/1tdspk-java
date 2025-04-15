package br.com.fiap.assai.model;

public class ContaSupermercado {

    private String cpf;
    private String itens;
    private double total;

    public ContaSupermercado(String cpf) {
        this.cpf = cpf;
        this.total = 0;
        this.itens = "";  //string vazia
    }

    public void adicionaCompra(int qtd, double valor, String nome) {
        String linha = nome + '\t' + qtd + '\t' + valor;
        this.itens = this.itens + linha + "\n";
        this.total = this.total + qtd * valor;
    }

    public String getItens() {
        return itens;
    }

    public double getTotal() {
        return total;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
