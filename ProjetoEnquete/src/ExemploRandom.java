import java.util.Random;

public class ExemploRandom {

    public static void main(String[] args) {

        Random rand = new Random();
        int numero = rand.nextInt(1000);
        System.out.println(numero);

        double preco = rand.nextInt(900000) + 100000;
        preco = preco * 0.01;
        System.out.println(preco);

    }

}
