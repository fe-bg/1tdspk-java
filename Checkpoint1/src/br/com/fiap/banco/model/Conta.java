package br.com.fiap.banco.model;

public class Conta {

    private String nome;
    private String tipo;
    private int numero;
    private double saldo;
    private double limite;

    public Conta(double balance, double limit, String number) {
        saldo = balance;
        this.limite = limit;
        this.numero = Integer.parseInt(number);
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNumero(int n) {
        this.numero = n;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Ex6
    public void deposito(double valor) {
        this.saldo = this.saldo + valor;
    }
}
