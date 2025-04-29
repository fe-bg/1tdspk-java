package br.com.fiap.jogatina;

import java.util.Random;

public class Dado {
    private Random rand;

    public Dado() {
        rand = new Random();
    }

    public int lancar() {
        return rand.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        Dado d1 = new Dado();
        Dado d2 = new Dado();

        int pontosCpu = d1.lancar() + d2.lancar();
        int pontosHum = d1.lancar() + d2.lancar();

        if (pontosHum > pontosCpu) {
            System.out.println("Parabéns, vc venceu!");
        }
        else if (pontosHum < pontosCpu) {
            System.out.println("Você perdeu!");
        }
        else {
            System.out.println("Deu empate!");
        }
        System.out.println(pontosHum + "\t" + pontosCpu);
    }



}
