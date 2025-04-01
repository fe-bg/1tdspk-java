package br.com.fiap.cadastro.model;

public class Endereco {

    String logradouro;
    private String numero;
    private String bairro;
    private String municipio;
    private String uf;
    private String complemento;
    private String cep;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String complemento, String bairro,
                    String municipio, String uf, String cep) {
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.logradouro = logradouro;
        this.municipio = municipio;
        this.numero = numero;
        this.uf = uf;
    }


}
