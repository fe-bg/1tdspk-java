package br.com.fiap.banco.app;

import br.com.fiap.banco.model.Conta;

public class Simulacao {

    public static void main(String[] args) {
        Conta c1 = new Conta(2350, 1000, "10348");
        Conta c2 = new Conta(12000, 0, "9389");

        c1.setNome("Alfredo Duarte");
        c1.setTipo("corrente");

        c2.setNome("Jorge Coutinho");
        c2.setTipo("poupança");

        c1.deposito(350);
        c1.deposito(680);

        c2.deposito(3000);
        c2.deposito(200);

        System.out.println(c1.getNome() + " " + c1.getSaldo() +
                            " " + c1.getLimite());

        System.out.println(c2.getNome() + " " + c2.getSaldo() +
                " " + c2.getLimite());
    }
}
