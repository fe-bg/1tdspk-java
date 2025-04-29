package br.com.fiap.jogatina;

import java.util.Random;
import java.util.Scanner;

public class JogoJokenpo {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner tec = new Scanner(System.in);

        int cpu = rand.nextInt(3);
        System.out.print("Informe a jogada (0 - papel, 1 - pedra, 2 - tesoura: ");
        int hum = tec.nextInt();

        Jokenpo jogo = new Jokenpo(hum, cpu);

        System.out.println("HUMANO x CPU");
        System.out.println(jogo.getJogadaHumano() + "\t" + jogo.getJogadaCpu());

        int resultado = jogo.decisao();

        if (resultado == -1)
            System.out.println("Parabéns, você ganhou!");
        else if (resultado == 1)
            System.out.println("Você perdeu!");
        else
            System.out.println("Deu empate!");
    }
}
