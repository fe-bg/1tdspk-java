package br.com.fiap.banco.model;

import java.util.Scanner;

public class TesteLeitura {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = tec.nextDouble();

        System.out.print("Digite seu nome: ");
        String nome = tec.next() + tec.nextLine();

        System.out.println(">>>>> " + nome + " nota: " + nota);


    }
}
