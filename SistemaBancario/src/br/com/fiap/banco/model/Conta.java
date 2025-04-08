package br.com.fiap.banco.model;

public class Conta {

    String titular;
    double saldo = 0;
    static double limiteCredito = 3000;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public static void aumentaLimiteCredito() {
        limiteCredito = limiteCredito * 1.2;
    }

    public static void main(String[] args) {
        Conta jose = new Conta("Jose Almeida", 1000);
        Conta maria = new Conta("Maria Magalhaes", 2780);
        Conta mafalda = new Conta("Mafalda Diniz", 4700);

        System.out.println(jose.titular);
        System.out.println(jose.saldo);
        System.out.println(jose.limiteCredito);

        Conta.aumentaLimiteCredito();

        System.out.println("XXXXXXXXXXXXXX");
        System.out.println(mafalda.titular);
        System.out.println(mafalda.limiteCredito);

        //mafalda.limiteCredito = 4500;
        Conta.limiteCredito = 4500;

        System.out.println("YYYYYYYYYYYYY");
        System.out.println(mafalda.titular + " " + mafalda.limiteCredito);
        System.out.println(jose.titular + " " + jose.limiteCredito);
        System.out.println(maria.titular + " " + maria.limiteCredito);

    }

}
