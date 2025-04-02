package br.com.fiap.cadastro.app;

import br.com.fiap.cadastro.model.Endereco;
import br.com.fiap.cadastro.model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Endereco fiap = new Endereco("Av Paulista", "1106",
                                    "3 andar", "Cerqueira César",
                                    "São Paulo", "SP", "01245-000");


        //fiap.numero = "1200";
        //System.out.println(fiap.numero);

        Pessoa p = new Pessoa("Edu", "(11) 8423423",33,null,null);

        System.out.println("IDADE: " + p.getIdade());
    }
}