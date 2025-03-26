import java.util.Random;

public class Adivinha {

    private int sorteado;

    public Adivinha() {
        Random aleat = new Random();
        this.sorteado = aleat.nextInt(1000) + 1;
    }


    public char chute(int num) {
        if (num < sorteado)
            return '+';
        else if (num > sorteado)
            return '-';
        else
            return '=';
    }

}
