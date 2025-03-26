import java.util.Random;

public class Adivinha {

    private int sorteado;

    //construtor vai classe atributo
    public Adivinha() {
        Random aleat = new Random();
        this.sorteado = aleat.nextInt(999) + 1;
    }


    public char chute(int num) {
        if (num < sorteado) {
            return '+';
        }
        else if (num > sorteado) {
            return '-';
        }
        else {
            return '=';
        }
    }
}
