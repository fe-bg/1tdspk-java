package br.com.fiap.jogatina;

/**
 * Esta classe é a responsável por decidir o ganhador do Jogo
 * Jokenpo. Ela possui 2 atributos que representam a jogada do
 * computador e do jogador humano.
 * Como são numeros inteiros, o 0: papel, 1: pedra e 2: tesoura.
 */
public class Jokenpo {

    private static int PAPEL = 0;
    private static int PEDRA = 1;
    private static int TESOURA = 2;

    private int jogadaHumano;
    private int jogadaCpu;

    public Jokenpo(int jogadaHumano, int jogadaCpu) {
        this.jogadaCpu = jogadaCpu;
        this.jogadaHumano = jogadaHumano;
    }

    /**
     * Este método é responsável por determinar o ganhador do jogo
     * @return -1 se o ganhador for o ser humano,
     *          0 se deu empate
     *          1 se o ganhador for a CPU
     */
    public int decisao() {
        if (jogadaHumano == jogadaCpu)
            return 0;
        else if (jogadaHumano == PAPEL && jogadaCpu == TESOURA)
            return 1;
        else if (jogadaHumano == PAPEL && jogadaCpu == PEDRA)
            return -1;
        else if (jogadaHumano == PEDRA && jogadaCpu == PAPEL)
            return 1;
        else if (jogadaHumano == PEDRA && jogadaCpu == TESOURA)
            return -1;
        else if (jogadaHumano == TESOURA && jogadaCpu == PEDRA)
            return 1;
        else
            return -1;
    }

    private String traduzJogada(int jogada) {
        if (jogada == PAPEL)
            return "PAPEL";
        else if (jogada == PEDRA)
            return "PEDRA";
        else
            return "TESOURA";
    }

    public String getJogadaCpu() {
        return traduzJogada(jogadaCpu);
    }

    public String getJogadaHumano() {
        return traduzJogada(jogadaHumano);
    }
}
