package br.com.fiap.cadastro.model;

public class Endereco {

    private String logradouro;
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

    //métodos acessores


    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
