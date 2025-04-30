package br.com.fiap.cofasi.model;

import java.util.Locale;

public class Aplicacao {

    public static void main(String[] args) {
        Cliente c = new Cliente("Dog", "(11) 9885367");

        Pet cachorro = new Pet("Dog", c, "Cachorro");


        //c = null;

        System.out.println(c);

        Pessoa p = new Pessoa("Joao");

        String nome = p.getNome();
        System.out.println(nome.toUpperCase());



    }
}
