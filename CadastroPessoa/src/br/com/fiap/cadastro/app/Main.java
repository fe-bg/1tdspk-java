package br.com.fiap.cadastro.app;

import br.com.fiap.cadastro.model.Endereco;

public class Main {
    public static void main(String[] args) {
        Endereco fiap = new Endereco("Av Paulista", "1106",
                                    "3 andar", "Cerqueira César",
                                    "São Paulo", "SP", "01245-000");


        fiap.numero = "1200";
        System.out.println(fiap.numero);
    }
}